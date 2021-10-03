package com.company;
/**
 * @author Султумов Баир
 * Вариант 24   Таблица №1 = 1,3,4,7.     Таблица №2 = 5,6.
 * Прибор может характизоваться:
 * 1)Названием
 * 3)Весом
 * 4)Ценой
 * 7)Источником питания: напряжения, тока, частоты
 * а также:
 * 5)Гарантийным сроком
 * 6)Диапазоном температур: tMax, tMin
 * */
public class Main {
    public static void main(String[] args){
    Tool Tool1=new Tool("Инструмент1",50,1000,5.0,2.0,3.0);
    Tool Tool2=new Tool("Инструмент2",40,1500,4.0,3.0, 1.0);
    ToolSub ToolSub1=new ToolSub("Инструмент3",20,2000,2.0,1.0,4.3,12,100,-25);
    ToolSub ToolSub2=new ToolSub("Инструмент4",16,500,10.1,2.0,6.0,14,50,-10);

        //Вывод до изменения
        System.out.println("До изменения: \n" + "Заказ на: " + Tool1.getToolName() + "\nВес: "
                + Tool1.getToolWeight() + "\nЦена: " + Tool1.getToolPrice() + "\nНапряжение: " + Tool1.getToolVoltage()
                + "\nТок: " + Tool1.getToolAmber()+ "\nЧастота: " + Tool1.getToolFreq());

        System.out.println("\n----------------------------------------------\n");

        System.out.println("До изменения: \n" + "Заказ на: " + Tool2.getToolName() + "\nВес: "
                + Tool2.getToolWeight() + "\nЦена: " + Tool2.getToolPrice() + "\nНапряжение: " + Tool2.getToolVoltage()
                + "\nТок: " + Tool2.getToolAmber()+ "\nЧастота: " + Tool2.getToolFreq());

        System.out.println("\n----------------------------------------------\n");

        System.out.println("До изменения: \n" + "Заказ на: " + ToolSub1.getToolName() + "\nВес: "
                + ToolSub1.getToolWeight() + "\nЦена: " + ToolSub1.getToolPrice() + "\nНапряжение: " + ToolSub1.getToolVoltage()
                + "\nТок: " + ToolSub1.getToolAmber()+ "\nЧастота: " + ToolSub1.getToolFreq()
                + "\nГарантийный период: " + ToolSub1.getWarrantyPeriod()+ "\nМакс. темп-ра: " + ToolSub1.getTMax()
                + "\nМин. темп-ра: " + ToolSub1.getTMin());

        System.out.println("\n----------------------------------------------\n");

        System.out.println("До изменения: \n" + "Заказ на: " + ToolSub2.getToolName() + "\nВес: "
                + ToolSub2.getToolWeight() + "\nЦена: " + ToolSub2.getToolPrice() + "\nНапряжение: " + ToolSub2.getToolVoltage()
                + "\nТок: " + ToolSub2.getToolAmber()+ "\nЧастота: " + ToolSub2.getToolFreq()
                + "\nГарантийный период: " + ToolSub2.getWarrantyPeriod()+ "\nМакс. темп-ра: " + ToolSub2.getTMax()
                + "\nМин. темп-ра: " + ToolSub2.getTMin());

        Tool1.setToolName("Мультиметр");
        Tool2.setToolWeight(1000);
        ToolSub1.setWarrantyPeriod(24);
        ToolSub2.setTMin(-234);

        System.out.println("\n----------------------------------------------\n");
        System.out.println("\nПосле изменения:\n");
        System.out.println("\n----------------------------------------------\n");

        //Вывод после изменения
        System.out.println("После изменения: \n" + "Заказ на: " + Tool1.getToolName() + "\nВес: "
                + Tool1.getToolWeight() + "\nЦена: " + Tool1.getToolPrice() + "\nНапряжение: " + Tool1.getToolVoltage()
                + "\nТок: " + Tool1.getToolAmber()+ "\nЧастота: " + Tool1.getToolFreq());

        System.out.println("\n----------------------------------------------\n");

        System.out.println("После изменения: \n" + "Заказ на: " + Tool2.getToolName() + "\nВес: "
                + Tool2.getToolWeight() + "\nЦена: " + Tool2.getToolPrice() + "\nНапряжение: " + Tool2.getToolVoltage()
                + "\nТок: " + Tool2.getToolAmber()+ "\nЧастота: " + Tool2.getToolFreq());

        System.out.println("\n----------------------------------------------\n");

        System.out.println("После изменения: \n" + "Заказ на: " + ToolSub1.getToolName() + "\nВес: "
                + ToolSub1.getToolWeight() + "\nЦена: " + ToolSub1.getToolPrice() + "\nНапряжение: " + ToolSub1.getToolVoltage()
                + "\nТок: " + ToolSub1.getToolAmber()+ "\nЧастота: " + ToolSub1.getToolFreq()
                + "\nГарантийный период: " + ToolSub1.getWarrantyPeriod()+ "\nМакс. темп-ра: " + ToolSub1.getTMax()
                + "\nМин. темп-ра: " + ToolSub1.getTMin());

        System.out.println("\n----------------------------------------------\n");

        System.out.println("После изменения: \n" + "Заказ на: " + ToolSub2.getToolName() + "\nВес: "
                + ToolSub2.getToolWeight() + "\nЦена: " + ToolSub2.getToolPrice() + "\nНапряжение: " + ToolSub2.getToolVoltage()
                + "\nТок: " + ToolSub2.getToolAmber()+ "\nЧастота: " + ToolSub2.getToolFreq()
                + "\nГарантийный период: " + ToolSub2.getWarrantyPeriod()+ "\nМакс. темп-ра: " + ToolSub2.getTMax()
                + "\nМин. темп-ра: " + ToolSub2.getTMin());
    }
}

