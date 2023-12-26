package A07_ExceptionParsing.AuthorException;

class Author {

        private final Long id;
        private final String name;
        private final String email;
        private final String password;
        static Long static_id = 0L;

        Author( String name, String email, String passwrod){

            this.id = static_id++;
            this.name = name;
            this.email = email;
            this.password = passwrod;}

        @Override
        public String toString(){
            return  " >> 아이디:" + id +
                    "   이름:" + name +
                    "   메일:" + email +
                    "   비밀번호:" + password +
                    " 입니다.";
        }

        Long getId() {return id;}
        String getName() {return name;}
        String getEmail() {return email;}
        String getPassword() {return password;}
        void print(String a){System.out.println(a);}
}
