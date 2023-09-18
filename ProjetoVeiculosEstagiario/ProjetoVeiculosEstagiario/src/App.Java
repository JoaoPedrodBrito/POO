public class App {
    public static void main(String[] args) throws Exception {
        
    Aviao a1 = new Aviao(12 , "Boing", "727BK", "BRANCO", 2010, 2011, "60T", "75T", 69, 4, "Boing", 16000, "GASOLINA", "LATAM ", "AÉREO", 
    95, 2, "P1231");
    a1.imprimir();

    Onibus o1 = new Onibus(19, "Buser", "a52", "ROSA", 2010, 2011, "5T", "6T", 45, 8, "Mercedes", 80, "Diesel", "Guaicurus", "EXECUTIVO", 50, "BJ27", "JDK-4521", "123ASD32", "MS", "CAMPO GRANDE", 2, "Rita Vieria-Centro");
    o1.imprimir();

    Moto m1 = new Moto(10, "Fazer", "Fazer 250", "PRETA", 2010, 2011, "120KG", "180KG", 1, 2, "HONDA", 90, "GASOLINA", "JOÃO", "MOTOCICLETA", 2, "JKLMNO", "HUP2302", "5678SGHJ", "MS", "CAMPO GRANDE", "RETO");
    m1.imprimir();

    Carro c1 = new Carro(9, "HILLUX", "TOYTA HILLUX", "BRANCA", 2010, 2011, "2T", "2.5T", 4, 4, "TOYOTA", 150, "FLEX", "RAFAELA", "VIAGEM", 4, "BCDE1234", "ZXCV1234", "ASDADC123", "MS", "CAMPO GRANDE", 4, false);
    c1.imprimir();

    Caminhao ca1 = new Caminhao(120, "ALFA PEPE", "V98", "PRETP", 2010, 2011, "2T", "3T", 2, 12, "VOLVO", 97, "DIESEL", "ROGERIO", "CARGA", 3, "LKJHGDASHJK21", "ASCS1234", "ASDAXSD123", "MS", "CAMPO GRANDE", 6, "MADEIRA");
    ca1.imprimir();
    
    }
}