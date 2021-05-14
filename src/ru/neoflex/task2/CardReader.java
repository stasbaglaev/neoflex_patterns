package ru.neoflex.task2;

public class CardReader implements USB {

    private MicroSD microSD;
    private WebCamera webCamera;

    public CardReader(MicroSD microSD) {
        setMicroSD(microSD);
    }

    public CardReader(WebCamera webCamera) {
        setWebCamera(webCamera);
    }

    public WebCamera getWebCamera() {
        return webCamera;
    }

    public void setWebCamera(WebCamera webCamera) {
        this.webCamera = webCamera;
    }

    @Override
    public void connectWithUsbCable() {
        getWebCamera().insert();
        getWebCamera().takePhoto();
    }

    @Override
    public void disconnectWithUsbCable() {
        getMicroSD().extract();
    }

    public MicroSD getMicroSD() {
        return microSD;
    }

    public void setMicroSD(MicroSD microSD) {
        this.microSD = microSD;
    }

}