package javaCore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, " Pessoa fisica"),
    PESSOA_JURIDICA(2, " Pessoa juridica");

    public final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }





    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }


        }
        return null;

    }


    TipoCliente(int valor) {
        this.VALOR = valor;

    }


    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

}
