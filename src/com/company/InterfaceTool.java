package com.company;

public interface InterfaceTool {
    //Геттеры
    String getToolName();
    int getToolWeight();
    int getToolPrice();
    double getToolVoltage();
    double getToolAmber();
    double getToolFreq();

    //Сеттеры
    void setToolName(String toolName);
    void setToolWeight(int weight);
    void setToolPrice(int price);
    void setToolVoltage(float toolVoltage);
    void setToolAmber(float toolAmber);
    void setToolFreq(float toolFreq);
}
