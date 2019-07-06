package com.example.create.abstract_factory;

/**
 * @ClassName Factory.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月04日 15:24:00
 */
public interface Factory {
    Gun produceGun();

    Bullet produceBullet();
}
