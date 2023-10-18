abstract class Animal {
        private String nome;
        private String especie;
        private	String raca;
        private String dataDeNascimento;
        private String proprietario;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEspecie() {
            return especie;
        }

        public void setEspecie(String especie) {
            this.especie = especie;
        }

        public String getRaca() {
            return raca;
        }

        public void setRaca(String raca) {
            this.raca = raca;
        }

        public String getDataDeNascimento() {
            return dataDeNascimento;
        }

        public void setDataDeNascimento(String dataDeNascimento) {
            this.dataDeNascimento = dataDeNascimento;
        }

        public String getProprietario() {
            return proprietario;
        }

        public void setProprietario(String proprietario) {
            this.proprietario = proprietario;
        }

    public Animal(String nome, String especie, String raca, String dataDeNascimento, String proprietario) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.dataDeNascimento = dataDeNascimento;
        this.proprietario = proprietario;
    }
}