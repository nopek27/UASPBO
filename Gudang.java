


class Gudang{
    

   private String minuman;
   private int harga;

    public Gudang(String minuman ,int harga){ //dengan parameter 
        this.minuman = minuman;
        this.harga = harga;

    
    }

    public String getminuman(){
        return minuman;
    }

    public int getharga(){
        return harga;
    }

    public  Gudang(){ //tidak dengan parameter (revisi)
        this.harga =   30000;
        this.minuman = "Arak Bali";
    }

}