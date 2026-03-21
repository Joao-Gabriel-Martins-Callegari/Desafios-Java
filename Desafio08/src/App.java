import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;

public class App {
    
    //Criando um vetor estatico com todos os meses por extenso em Português
    private static final String[] mesesPorExtenso = {
        "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    //Metodo de Data por extenso
    public static String DataPorExtenso(String dataStr){

        //Uso um try catch para caso ocorra uma excessão de uma Data Invalida
        try {
            //Criando meu formato de Data
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

            //Define que o formato não deve ser leniente
            //Ou seja, o parse não aceitará datas inválidas como 31/02/2026
            formato.setLenient(false);

            //convertendo a string 'dataStr' em um objeto 'Date'
            Date data = formato.parse(dataStr);

            //Cria um objeto do tipo Calendar
            Calendar calendario = Calendar.getInstance();

            //Define o valor interno do Calendar como a data que acabamos de converter
            calendario.setTime(data);

            //Obtemos o dia do mês (1 de 31) da data armazenada no Calendar
            int dia = calendario.get(Calendar.DAY_OF_MONTH);

            //Obtem o numero do mês da data.
            //O java usa valores de 0 a 11 para os meses, então isso será util para pegar o mês 
            //Por extenso correto no Vetor
            int meses = calendario.get(Calendar.MONTH);

            //Obtem o ano completo da data
            int ano = calendario.get(Calendar.YEAR);

            //Monta e retorna a string com a data formatada no estilo: 'D de MêsPorExtenso de AAAA'
            return dia + " de " + mesesPorExtenso[meses] + " de " + ano;

        } catch (ParseException e) {
            //Retorna 'NULL' caso a data seja invalida
            return null;
        }
    };

    public static void main(String[] args) throws Exception {
        String data01 = "10/10/2026";
        String data02 = "31/02/2026";

        System.out.println(DataPorExtenso(data01));
        System.out.println(DataPorExtenso(data02));

    }
}
