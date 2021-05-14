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
        if (getWebCamera() != null) {
            getWebCamera().insert();
            getWebCamera().takePhoto();
        } else if (getMicroSD() != null) {
            getMicroSD().insert();
            getMicroSD().copyData();
        }
    }

    @Override
    public void disconnectWithUsbCable() {
        if (getWebCamera() != null) {
            getWebCamera().extract();
        } else if (getMicroSD() != null) {
            getMicroSD().extract();
        }
    }

    public MicroSD getMicroSD() {
        return microSD;
    }

    public void setMicroSD(MicroSD microSD) {
        this.microSD = microSD;
    }
}