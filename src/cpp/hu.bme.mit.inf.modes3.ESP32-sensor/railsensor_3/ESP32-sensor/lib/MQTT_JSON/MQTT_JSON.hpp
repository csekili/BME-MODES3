#ifndef MQTT_KEEPALIVE
  #define MQTT_KEEPALIVE 15000
#endif
#ifndef MQTT_SOCKET_TIMEOUT
  #define MQTT_SOCKET_TIMEOUT 15000
#endif
#ifndef MQTT_MAX_PACKET_SIZE
  #define MQTT_MAX_PACKET_SIZE 512
#endif
#ifndef DEVICE_NAME
  #define DEVICE_NAME "Bakter02"
#endif
#ifndef CONF_SSID
  #define CONF_SSID "MoDeS3"
#endif
#ifndef PASS
  #define PASS "LaborImage"
#endif
#ifndef MQTT_IP
  #define MQTT_IP "192.168.1.2"
#endif
#ifndef MQTT_PT
  #define MQTT_PT 1883
#endif
#ifndef MQTT_US
  #define MQTT_US ""
#endif
#ifndef MQTT_PW
  #define MQTT_PW ""
#endif

#ifndef BDATA_CH
  #define BDATA_CH "/modes3/data/bela02"
#endif
#ifndef CONSOLE_CH
  #define CONSOLE_CH "/modes3/console"
#endif
#ifndef DATA_CH
  #define DATA_CH "/modes3/data"
#endif
#ifndef BEVENT_CH
  #define BEVENT_CH "/modes3/event/bela02"
#endif
#ifndef EVENT_CH
  #define EVENT_CH "/modes3/event"
#endif

#include <PubSubClient.h>
#include <WiFi.h>
#include <ArduinoJson.h>

#ifndef MQTT_JSON_HPP
#define MQTT_JSON_HPP

struct HeaderData {
    const char* sender;
    int time;
    char type[10];
};

class MQTT_JSON {
public:
  PubSubClient client;
  MQTT_JSON(WiFiClient*);
  int getTime();
  void callback(char*, byte*, unsigned int);
  void PongSend();
  void WifiConnect();
  void MQTTConnect();
  void ConnCheck();
  void TrainSend(char* train, int kocsiszam);
  void EventSend(bool detect, bool direction);
  void SpeedSend(double speed);
  void LengthSend(double length, int kocsiszam);
};

#endif