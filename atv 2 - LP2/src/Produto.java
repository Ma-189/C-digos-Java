public class Produto {

		private String codigo;
        private String nome;
        private Double preco;

        public Produto() {
            this.codigo = "";
            this.nome = "";
            this.preco = 0.0;
        }

        public Produto (String codigo, String nome, Double preco) {

            this.codigo = codigo;
            this.nome = nome;
            this.preco = preco;
        }

        public String getCódigo() {
            return codigo;
        }

        public void setCódigo(String codigo) {
            this.codigo = codigo;
        }
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        public Double getPreço() {
            return preco;
        }

        public void setPreço(Double preco) {
            this.preco = preco;
        }

        @Override
        public String toString() {
            return "Produto [Código: " +this.codigo+ "  Nome: " +this.nome+ "  Preço: " +this.preco+ "]";
        }

    }
