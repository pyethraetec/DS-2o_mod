int LED = 9;
void setup()
{
  pinMode(LED, OUTPUT);
}

void loop()
{
  digitalWrite(LED, HIGH);
  delay(300); // Wait for 1000 millisecond(s)
  digitalWrite(LED, LOW);
  delay(100); // Wait for 1000 millisecond(s)
}
