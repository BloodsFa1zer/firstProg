# firstProg
class Main {

    public static void main(String[] args) throws Exception {
        File f1 = new File("txt");

        BufferedReader br = new BufferedReader(new FileReader(f1));
        String s;
        List lines = Files.readAllLines(Paths.get("res/file.txt"));
        Files.write(Paths.get("res/file.txt"), lines);
        while ((s = br.readLine()) != null) {
            if (s.indexOf('W') == 0) {
                String replace = s.replace('W', 'w');
                System.out.println(replace);
            }
        }
    }
}
