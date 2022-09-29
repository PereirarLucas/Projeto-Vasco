public class Torcedor {
    int categoria;

    public Torcedor(int categoria) {
        this.categoria = categoria;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String formatCategoria(int categoria) {
        if(categoria ==1) {
            return "Torcedor Comum";
        }
        else if(categoria ==2) {
            return "Sócio torcedor";
        }
        else if(categoria ==3) {
            return "Sócio Camisas Negras";
        }
        else if(categoria ==4) {
            return "Sócio Norte ao Sul";
        }
        return "sócio não existe";
    }
}
