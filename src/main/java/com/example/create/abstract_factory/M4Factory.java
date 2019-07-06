package com.example.create.abstract_factory;

/**
 * @ClassName M4Factory.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月04日 15:56:00
 */
public class M4Factory implements Factory {
    @Override
    public Gun produceGun() {
        return new M4Gun();
    }

    @Override
    public Bullet produceBullet() {
        return new M4Bullet();
    }
}
