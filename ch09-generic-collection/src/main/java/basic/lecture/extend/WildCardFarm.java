package main.java.basic.lecture.extend;

public class WildCardFarm {

    // 토끼가 어떤 토끼든 상관 X
    // (Rabbit, Bunny, DrunkenBunny) 셋 다 상관없음
    public void anyType(RabbitFarm<?> farm){
        farm.getAnimal().cry();
    }

    // 토끼중 Bunny와 Bunny 하위만 가능
    // (Bunny, DrunkenBunny) 가능
    public void extendsType(RabbitFarm<? extends Bunny> farm){
        farm.getAnimal().cry();
    }

    // 토끼중 Bunny와 Bunny 상위만 가능
    // (Bunny, Rabbit) 가능
    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }
}
