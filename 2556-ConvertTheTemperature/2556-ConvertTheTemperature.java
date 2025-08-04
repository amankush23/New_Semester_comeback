// Last updated: 8/4/2025, 11:09:33 PM
class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahren = celsius * 1.8 + 32;
        return new double[] {kelvin, fahren};

    }
}