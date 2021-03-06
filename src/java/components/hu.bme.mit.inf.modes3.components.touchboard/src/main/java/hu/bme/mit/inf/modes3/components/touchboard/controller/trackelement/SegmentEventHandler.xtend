package hu.bme.mit.inf.modes3.components.touchboard.controller.trackelement

import hu.bme.mit.inf.modes3.components.touchboard.bridge.ITouchboardBridge
import hu.bme.mit.inf.modes3.components.touchboard.ui.ThreadSafeNode
import hu.bme.mit.inf.modes3.messaging.messages.enums.SegmentState
import org.slf4j.ILoggerFactory
import org.slf4j.Logger

class SegmentEventHandler {

	static val ENABLED = "enabled"
	static val DISABLED = "disabled"
	static val OCCUPIED = "occupied"

	val Logger logger
	val ThreadSafeNode node
	val int segmentId

	val ITouchboardBridge touchboardBridge

	new(ITouchboardBridge touchboardBridge, ThreadSafeNode node, ILoggerFactory loggerFactory) {
		this.logger = loggerFactory.getLogger(this.class.name)
		this.node = node
		this.segmentId = node.nodeId
		this.touchboardBridge = touchboardBridge
	}

	def synchronized setDisabled() {
		node.removeCssClass(ENABLED)
		node.addCssClass(DISABLED)
	}

	def synchronized setEnabled() {
		node.removeCssClass(DISABLED)
		node.addCssClass(ENABLED)
	}

	def synchronized setOccupied() {
		node.addCssClass(OCCUPIED)
	}

	def  synchronized setFree() {
		node.removeCssClass(OCCUPIED)
	}

	def void onSegmentClicked() {
		try {
			val state = touchboardBridge.getSegmentState(segmentId)
			val newState = getSegmentOppositeState(state)
			setSegmentState(newState)
		} catch (Exception ex) {
			logger.error(ex.message, ex)
		}
	}

	def void onEnableSegment() {
		try {
			setSegmentState(SegmentState.ENABLED)
		} catch (Exception ex) {
			logger.error(ex.message, ex)
		}
	}

	def void onDisableSegment() {
		try {
			setSegmentState(SegmentState.DISABLED)
		} catch (Exception ex) {
			logger.error(ex.message, ex)
		}
	}

	private def setSegmentState(SegmentState state) {
		touchboardBridge.sendSegmentCommand(segmentId, state)
		logger.info('''Segment «segmentId» is «state»''')
	}
	
	private def getSegmentOppositeState(SegmentState state) {
		switch (state) {
			case ENABLED:
				SegmentState.DISABLED
			case DISABLED:
				SegmentState.ENABLED
		}
	}
}
