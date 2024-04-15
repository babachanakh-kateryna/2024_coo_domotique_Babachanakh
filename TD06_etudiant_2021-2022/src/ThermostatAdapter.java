public class ThermostatAdapter implements Appareil {
    private thermos.Thermostat thermostat;

    public ThermostatAdapter() {
        this.thermostat = new thermos.Thermostat();
    }

    @Override
    public void allumer() {
        thermostat.monterTemperature();
    }

    @Override
    public void eteindre() {
        thermostat.baisserTemperature();
    }

}
