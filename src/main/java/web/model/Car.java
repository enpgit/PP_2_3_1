package web.model;

public class Car {

    private String modelCar;

    private  String engineCar;

    private  int idCar;

    public Car() {
    }

    public Car(int idCar, String modelCar, String engineCar) {
        this.idCar = idCar;
        this.modelCar = modelCar;
        this.engineCar = engineCar;

    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getEngineCar() {
        return engineCar;
    }

    public void setEngineCar(String engineCar) {
        this.engineCar = engineCar;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }
}
