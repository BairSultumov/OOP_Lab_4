package com.company;

public class Tool implements InterfaceTool {
    String toolName;    //Название устройства (1)
    int weight;         //Вес (2)
    int price;          //Цена (3)
    double toolVoltage; //Напряжение (4)
    double toolAmber;   //Ток (4)
    double toolFreq;    //Частота (4)

    //Конструктор класса
    public Tool(String toolName, int weight, int price, double toolVoltage, double toolAmber, double toolFreq) {
        this.toolName = toolName;
        this.weight = weight;
        this.price = price;
        this.toolVoltage = toolVoltage;
        this.toolAmber = toolAmber;
        this.toolFreq = toolFreq;
    }
    //Переопределение Геттеров интерфейса InterfaceTool
    @Override
    public String getToolName() { return this.toolName; }

    @Override
    public int getToolWeight() { return this.weight; }

    @Override
    public int getToolPrice() { return this.price; }

    @Override
    public double getToolVoltage() { return this.toolVoltage; }

    @Override
    public double getToolAmber() { return this.toolAmber; }

    @Override
    public double getToolFreq() { return this.toolFreq; }

    //Переопределение Сеттеров интерфейса InterfaceTool
    @Override
    public void setToolName(String toolName) { this.toolName=toolName; }

    @Override
    public void setToolWeight(int weight) { this.weight=weight; }

    @Override
    public void setToolPrice(int price) { this.price=price; }

    @Override
    public void setToolVoltage(float toolVoltage) { this.toolVoltage=toolVoltage; }

    @Override
    public void setToolAmber(float toolAmber) { this.toolAmber=toolAmber; }

    @Override
    public void setToolFreq(float toolFreq) { this.toolFreq=toolFreq; }
}
