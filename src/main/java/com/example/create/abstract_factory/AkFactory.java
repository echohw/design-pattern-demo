package com.example.create.abstract_factory;


/**
 * @ClassName AkFactory.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月04日 15:56:00
 */
public class AkFactory implements Factory {
    @Override
    public Gun produceGun() {
        return new AkGun();
    }

    @Override
    public Bullet produceBullet() {
        return new AkBullet();
    }
}
