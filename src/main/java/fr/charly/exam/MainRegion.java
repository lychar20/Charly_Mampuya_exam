package fr.charly.exam;



import fr.charly.exam.entity.Region.Region;
import fr.charly.exam.repository.region.RegionRepository;
import fr.charly.exam.service.Dump;

public class MainRegion {
    public static void main(String[] args) {

        RegionRepository rg = new RegionRepository();
        System.out.println(rg);

//        Region region = rg.findDepartmentsByRegion("region","Centre-Val de Loire" );
//        System.out.println(region);

    }
}