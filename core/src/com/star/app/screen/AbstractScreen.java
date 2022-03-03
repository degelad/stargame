package com.star.app.screen;

import com.badlogic.gdx.Screen;

/**
 *
 * @author degelad
 */
public abstract class AbstractScreen implements Screen {

//метод срабатывает когда получаем фокус экрана
    @Override
    public void show() {
    }

//метод отрисовывает экран на вход ждет атрибут дельта-тайм
    @Override
    public void render(float delta) {
    }

//метод срабатывает если меняем разрешение нашего экрана, например при повороте экрана телефона.
    @Override
    public void resize(int i, int i1) {
    }

//метод срабатывает при постановке на паузу приложения
    @Override
    public void pause() {
    }

//метод срабатывает при снятии с паузы приложения
    @Override
    public void resume() {
    }

//метод срабатывает когда теряем фокус экрана
    @Override
    public void hide() {
    }

//метод вызывает уничтожение экрана, используется для очистки ресурсов которые не может очищать Garbage Collection. Текстуры и прочее.
    @Override
    public void dispose() {
    }

}
