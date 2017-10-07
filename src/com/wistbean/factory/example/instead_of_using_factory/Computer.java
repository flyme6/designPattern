package com.wistbean.factory.example.instead_of_using_factory;

/**
 * Created by wistbean on 2017/10/7.
 */
public class Computer {

    private Host host;
    private _keyboard _keyboard;
    private Monitor monitor;
    private Mouse mouse;

    public Computer(Host host,_keyboard _keyboard,Monitor monitor,Mouse mouse){
        this.host = host;
        this._keyboard = _keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
    }

    public void show()
    {
        this.host.describe();
        this._keyboard.describe();
        this.monitor.describe();
        this.mouse.describe();
    }

    public static void main(String[] args)
    {
        Host host = new Host();
        _keyboard keyboard = new _keyboard();
        Monitor monitor = new Monitor();
        Mouse mouse = new Mouse();

        Computer computer = new Computer(host,keyboard,monitor,mouse);
        computer.show();
    }
}
