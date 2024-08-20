public class CepFormaterExample {
    public static void main(String[] args) {
        try {
            String cepFormater = formaterCep("2376506");
            System.out.println(cepFormater);
        } catch (InvalidCEP e) {
            System.out.println("CEP don't corresponds with the business rules.");
        }
    }
    static String formaterCep(String cep) throws InvalidCEP {
        if (cep.length() != 8)
            throw new InvalidCEP();

            return "23.765-064";
    }
}
