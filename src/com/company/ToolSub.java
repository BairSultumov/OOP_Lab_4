package com.company;

//Этот класс дополняет класс Tool и переобределяет функции интерфейса InterfaceToolSub
public class ToolSub extends Tool implements InterfaceToolSub{
    int warrantyPeriod;     //Гарантийный срок(5)
    int tMax;               //Максимальная температура(6)
    int tMin;               //Минимальная температура(6)

    public ToolSub(String toolName, int weight, int price, double toolVoltage, double toolAmber,
                   double toolFreq,int warrantyPeriod,int tMax,int tMin) {
        super(toolName, weight, price, toolVoltage, toolAmber, toolFreq);
        this.warrantyPeriod=warrantyPeriod;
        this.tMax=tMax;
        this.tMin=tMin;
    }

    @Override
    public int getWarrantyPeriod() { return this.warrantyPeriod; }

    @Override
    public int getTMax() { return this.tMax; }

    @Override
    public int getTMin() { return this.tMin; }

    @Override
    public void setWarrantyPeriod(int warrantyPerid) { this.warrantyPeriod=warrantyPerid; }

    @Override
    public void setTMax(int tMax) { this.tMax=tMax; }

    @Override
    public void setTMin(int tMin) { this.tMin=tMin; }
}
