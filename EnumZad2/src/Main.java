
public class Main {
    public static void main(String[] args) {

        PackageSize packageSize1 = PackageSize.getPackageSize(45,50);
        PackageSize packageSize2 = PackageSize.getPackageSize(96,110);
        PackageSize packageSize3 = PackageSize.getPackageSize(150,240);
        PackageSize packageSize4 = PackageSize.getPackageSize(-1,50);
        PackageSize packageSize5 = PackageSize.getPackageSize(1000,20000);




        System.out.println(packageSize1);
        System.out.println(packageSize2);
        System.out.println(packageSize3);
        System.out.println(packageSize4);
        System.out.println(packageSize5);




    }
}
