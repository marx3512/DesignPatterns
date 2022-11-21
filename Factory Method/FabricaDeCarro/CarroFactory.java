public class CarroFactory {
    public ICarro createCarro(String tipo){
        if(tipo == "Ford"){
            CarroFord carroFord = new CarroFord("2021", "Ford", 43.000);
            carroFord.TipoCarro();
            return carroFord;
        }
        else if(tipo == "Toyota"){
            CarroToyota carroToyota = new CarroToyota("2018", "Toyota", 50.000);
            carroToyota.TipoCarro();
            return carroToyota;
        }
        else if(tipo == "Volkswagen"){
            CarroVolkswagen carroVolkswagen = new CarroVolkswagen("2019", "Volkswagen", 50.000);
            carroVolkswagen.TipoCarro();
            return carroVolkswagen;
        }
        else{
            System.out.println("Nao foi possivel criar o carro pedido");
            return null;
        }
    }
}
