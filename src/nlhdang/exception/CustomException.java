package nlhdang.exception;

class CustomException extends Exception {

        public CustomException(String message) {
            super(message);
        }


        public static void main(String[] args) {
            try {
                throw new CustomException("Đây là một lỗi tùy chỉnh!");
            } catch (CustomException e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }

}
