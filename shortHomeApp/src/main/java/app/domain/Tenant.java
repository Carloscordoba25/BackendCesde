package app.domain;


    public class Tenant extends Person {

        private String fieldType;


        public String getFieldType() {
            return fieldType;
        }

        public void setFieldType(String fieldType) {
            this.fieldType = fieldType;
        }

        @Override
        public void create() {
            super.create();
        }

        @Override
        public void selectAll() {
            super.selectAll();
        }

        @Override
        public void update() {
            super.update();
        }

        @Override
        public void delete(int id) {
            super.delete(id);
        }

        @Override
        public void selectById(int id) {
            super.selectById(id);
        }
    }

