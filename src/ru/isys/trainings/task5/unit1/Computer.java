package ru.isys.trainings.task5.unit1;

public class Computer {

    private ComputerInfo computerInfo;

    public ComputerInfo getComputerInfo() {
        return computerInfo;
    }

    public Computer(String os, String processor, String ram) {
        computerInfo = new ComputerInfo(os, processor, ram);
    }

    class ComputerInfo {
        private String os;
        private String processor;
        private String ram;

        public String getOs() {
            return os;
        }

        public void setOs(String os) {
            this.os = os;
        }

        public String getProcessor() {
            return processor;
        }

        public void setProcessor(String processor) {
            this.processor = processor;
        }

        public String getRam() {
            return ram;
        }

        public void setRam(String ram) {
            this.ram = ram;
        }

        public ComputerInfo(String os, String processor, String ram) {
            this.os = os;
            this.processor = processor;
            this.ram = ram;
        }

        @Override
        public String toString() {
            return "ComputerInfo{" +
                    "OS='" + os + '\'' +
                    ", Processor='" + processor + '\'' +
                    ", RAM='" + ram + '\'' +
                    '}';
        }
    }

}
