//package com.example.demo;
//
//import com.example.demo.entity.Block;
//import com.example.demo.entity.Course;
//import com.example.demo.entity.StudentRegistration;
//import com.example.demo.service.BlockService;
//import com.example.demo.service.CourseService;
//import com.example.demo.service.StudentRegistrationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class StartUpRunner implements CommandLineRunner {
//
//    @Autowired
//    StudentRegistrationService studentRegistrationService;
//    @Autowired
//    CourseService courseService;
//    @Autowired
//    BlockService blockService;
//
//
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        // DATA ENTRY OF COURSES
//
//        Course c1 = new Course("FPP","CS390","FPP");
//        Course c2 = new Course("MPP","CS401","MPP");
//        Course c3 = new Course("WAP","CS472","WAP");
//        Course c4 = new Course("SE","CS425","SE");
//        Course c5 = new Course("ALGORITHM","CS432","ALGORITHM");
//        Course c6 = new Course("DBMS","CS422","DBMS");
//        Course c7 = new Course("EA","CS544","EA");
//        Course c8 = new Course("WAA","CS545","WAA");
//        Course c9 = new Course("BDT","CS523","BDT");
//        Course c10 = new Course("BD","CS522","BD");
//        Course c11 = new Course("MWA","CS572","MWA");
//        Course c12 = new Course("SA","CS590","SA");
//        Course c13 = new Course("MACHINE LEARNING","CS582","ML");
//        Course c14 = new Course("MOBILE DEVICE PROGRAMMING","CS473","MDP");
//        Course c15 = new Course("ADVANCED SOFTWARE DEVELOPMENT","CS525","ASD");
//
//        courseService.saveCourse(c1);courseService.saveCourse(c2);courseService.saveCourse(c3);courseService.saveCourse(c4);
//        courseService.saveCourse(c5);courseService.saveCourse(c6);courseService.saveCourse(c7);courseService.saveCourse(c8);
//        courseService.saveCourse(c9);courseService.saveCourse(c10);courseService.saveCourse(c11);courseService.saveCourse(c12);
//        courseService.saveCourse(c13);courseService.saveCourse(c14);courseService.saveCourse(c15);
//
//
//        // DATA ENTRY OF BLOCKS
//
//        Block b11 = new Block("FEBRUARY","CS390","FPP");
//        Block b12 = new Block("FEBRUARY","CS401","MPP");
//        Block b13 = new Block("FEBRUARY","CS472","WAP");
//        Block b14 = new Block("FEBRUARY","CS432","ALGORITHM");
//        Block b15 = new Block("FEBRUARY","CS590","SA");
//        Block b21 = new Block("MARCH","CS390","FPP");
//        Block b22 = new Block("MARCH","CS401","MPP");
//        Block b23 = new Block("MARCH","CS472","WAP");
//        Block b24 = new Block("MARCH","CS525","ASD");
//        Block b25 = new Block("MARCH","CS473","MOBILE DEVICE PROGRAMMING");
//        Block b31 = new Block("APRIL","CS572","MWA");
//        Block b32 = new Block("APRIL","CS522","BD");
//        Block b33 = new Block("APRIL","CS472","WAP");
//        Block b34 = new Block("APRIL","CS544","EA");
//        Block b35 = new Block("APRIL","CS545","WAA");
//        Block b41 = new Block("MAY","CS545","WAA");
//        Block b42 = new Block("MAY","CS523","BDT");
//        Block b43 = new Block("MAY","CS572","MWA");
//        Block b44 = new Block("MAY","CS425","SE");
//        Block b45 = new Block("MAY","CS522","BD");
//        Block b51 = new Block("JUNE","CS544","EA");
//        Block b52 = new Block("JUNE","CS523","BDT");
//        Block b53 = new Block("JUNE","CS582","MACHINE LEARNING");
//        Block b54 = new Block("JUNE","CS545","WAA");
//        Block b55 = new Block("JUNE","CS422","DBMS");
//        Block b61 = new Block("JULY","CS432","ALGORITHM");
//        Block b62 = new Block("JULY","CS590","SA");
//        Block b63 = new Block("JULY","CS572","MWA");
//        Block b64 = new Block("JULY","CS545","WAA");
//        Block b65 = new Block("JULY","CS422","DBMS");
//        Block b66 = new Block("JULY","CS522","BD");
//        Block b71 = new Block("JULY","CS525","ADVANCED SOFTWARE DEVELOPMENT");
//        Block b72 = new Block("JULY","CS590","SA");
//        Block b73 = new Block("JULY","CS425","SE");
//        Block b74 = new Block("JULY","CS545","WAA");
//        Block b75 = new Block("JULY","CS422","DBMS");
//        Block b76 = new Block("JULY","CS473","MOBILE DEVICE PROGRAMMING");
//        Block b81 = new Block("AUGUST","CS572","MWA");
//        Block b82 = new Block("AUGUST","CS523","BDT");
//        Block b83 = new Block("AUGUST","CS545","WAA");
//        Block b84 = new Block("AUGUST","CS590","SA");
//        Block b85 = new Block("AUGUST","CS422","DBMS");
//        Block b86 = new Block("AUGUST","CS473","MOBILE DEVICE PROGRAMMING");
//        Block b91 = new Block("SEPTEMBER","CS572","MWA");
//        Block b92 = new Block("SEPTEMBER","CS525","ADVANCED SOFTWARE DEVELOPMENT");
//        Block b93 = new Block("SEPTEMBER","CS545","WAA");
//        Block b94 = new Block("SEPTEMBER","CS432","ALGORITHM");
//        Block b95 = new Block("SEPTEMBER","CS425","SE");
//        Block b96 = new Block("SEPTEMBER","CS473","MOBILE DEVICE PROGRAMMING");
//        Block b101 = new Block("OCTOBER","CS572","MWA");
//        Block b102 = new Block("OCTOBER","CS422","DBMS");
//        Block b103 = new Block("OCTOBER","CS545","WAA");
//        Block b104 = new Block("OCTOBER","CS425","SE");
//        Block b105 = new Block("OCTOBER","CS523","BDT");
//        Block b106 = new Block("OCTOBER","CS432","ALGORITHM");
//        Block b111 = new Block("NOVEMBER","CS590","SA");
//        Block b112 = new Block("NOVEMBER","CS422","DBMS");
//        Block b113 = new Block("NOVEMBER","CS545","WAA");
//        Block b114 = new Block("NOVEMBER","CS525","ADVANCED SOFTWARE DEVELOPMENT");
//        Block b115 = new Block("NOVEMBER","CS523","BDT");
//        Block b116 = new Block("NOVEMBER","CS432","ALGORITHM");
//        Block b121 = new Block("DECEMBER","CS590","SA");
//        Block b122 = new Block("DECEMBER","CS422","DBMS");
//        Block b123 = new Block("DECEMBER","CS425","SE");
//        Block b124 = new Block("DECEMBER","CS525","ADVANCED SOFTWARE DEVELOPMENT");
//        Block b125 = new Block("DECEMBER","CS523","BDT");
//        Block b126 = new Block("DECEMBER","CS425","SE");
//        Block b131 = new Block("JANUARY","CS545","WAA");
//        Block b132 = new Block("JANUARY","CS522","BD");
//        Block b133 = new Block("JANUARY","CS425","SE");
//        Block b134 = new Block("JANUARY","CS582","MACHINE LEARNING");
//        Block b135 = new Block("JANUARY","CS432","ALGORITHM");
//        Block b136 = new Block("JANUARY","CS523","BDT");
//
//        blockService.saveBlock(b11);blockService.saveBlock(b12);blockService.saveBlock(b13);
//        blockService.saveBlock(b14);blockService.saveBlock(b15);blockService.saveBlock(b21);
//        blockService.saveBlock(b22);blockService.saveBlock(b23);blockService.saveBlock(b24);
//        blockService.saveBlock(b25);blockService.saveBlock(b31);blockService.saveBlock(b32);
//        blockService.saveBlock(b33);blockService.saveBlock(b34);blockService.saveBlock(b35);
//        blockService.saveBlock(b41);blockService.saveBlock(b42);blockService.saveBlock(b43);
//        blockService.saveBlock(b44);blockService.saveBlock(b45);blockService.saveBlock(b51);
//        blockService.saveBlock(b52);blockService.saveBlock(b53);blockService.saveBlock(b54);
//        blockService.saveBlock(b55);blockService.saveBlock(b61);blockService.saveBlock(b62);
//        blockService.saveBlock(b63);blockService.saveBlock(b64);blockService.saveBlock(b65);
//        blockService.saveBlock(b66);blockService.saveBlock(b71);blockService.saveBlock(b72);
//        blockService.saveBlock(b73);blockService.saveBlock(b74);blockService.saveBlock(b75);
//        blockService.saveBlock(b76);blockService.saveBlock(b81);blockService.saveBlock(b82);
//        blockService.saveBlock(b83);blockService.saveBlock(b84);blockService.saveBlock(b85);
//        blockService.saveBlock(b86);blockService.saveBlock(b91);blockService.saveBlock(b92);
//        blockService.saveBlock(b93);blockService.saveBlock(b94);blockService.saveBlock(b95);
//        blockService.saveBlock(b96);blockService.saveBlock(b101);blockService.saveBlock(b102);
//        blockService.saveBlock(b103);blockService.saveBlock(b104);blockService.saveBlock(b105);
//        blockService.saveBlock(b106);blockService.saveBlock(b111);blockService.saveBlock(b112);
//        blockService.saveBlock(b113);blockService.saveBlock(b114);blockService.saveBlock(b115);
//        blockService.saveBlock(b116);blockService.saveBlock(b121);blockService.saveBlock(b122);
//        blockService.saveBlock(b123);blockService.saveBlock(b124);blockService.saveBlock(b125);
//        blockService.saveBlock(b126);blockService.saveBlock(b131);blockService.saveBlock(b132);
//        blockService.saveBlock(b133);blockService.saveBlock(b134);blockService.saveBlock(b135);
//        blockService.saveBlock(b136);
//
//
//        // DATA ENTRY OF STUDENTS REGISTRATION
//
//        StudentRegistration s1 = new StudentRegistration("Anna","Smith","01-01-1997","FEBRUARY","fpp","US");
//        StudentRegistration s2 = new StudentRegistration("Bob","Marley","01-01-1991","FEBRUARY","mpp","OPT");
//        StudentRegistration s3 = new StudentRegistration("John","David","01-01-1994","FEBRUARY","fpp","CPT");
//
//        StudentRegistration s4 = new StudentRegistration("Simon","Danny","01-01-1997","FEBRUARY","fpp","US");
//        StudentRegistration s5 = new StudentRegistration("Johnson","David","01-01-1991","FEBRUARY","mpp","OPT");
//        StudentRegistration s6 = new StudentRegistration("Leo","Nilson","01-01-1994","FEBRUARY","mpp","CPT");
//
//        StudentRegistration s7 = new StudentRegistration("Walker","Washington","01-01-1997","FEBRUARY","fpp","US");
//        StudentRegistration s8 = new StudentRegistration("Son","Witon","01-01-1991","FEBRUARY","mpp","OPT");
//        StudentRegistration s9 = new StudentRegistration("Henry","Lucas","01-01-1994","FEBRUARY","mpp","CPT");
//
//        StudentRegistration s10 = new StudentRegistration("Jason","Brand","01-01-1997","FEBRUARY","fpp","US");
//        StudentRegistration s11= new StudentRegistration("Ryan","Antony","01-01-1991","FEBRUARY","mpp","CPT");
//        StudentRegistration s12= new StudentRegistration("Frank","Gerard","01-01-1994","FEBRUARY","fpp","CPT");
//
//        StudentRegistration s13= new StudentRegistration("Danilo","Hernandez","01-01-1997","FEBRUARY","fpp","US");
//        StudentRegistration s14= new StudentRegistration("Michael","Essien","01-01-1991","FEBRUARY","mpp","OPT");
//        StudentRegistration s15= new StudentRegistration("Wayne","Ferdinand","01-01-1994","FEBRUARY","fpp","CPT");
//
//        StudentRegistration s16= new StudentRegistration("Sandres","Montreo","01-01-1997","FEBRUARY","fpp","OPT");
//        StudentRegistration s17= new StudentRegistration("Suzan","Michael","01-01-1991","FEBRUARY","mpp","US");
//        StudentRegistration s18= new StudentRegistration("Chris","Jackson","01-01-1994","FEBRUARY","mpp","US");
//
//        StudentRegistration s19= new StudentRegistration("Marry","Carlos","01-01-1997","FEBRUARY","fpp","OPT");
//        StudentRegistration s20= new StudentRegistration("Lucas","Montrea","01-01-1991","FEBRUARY","mpp","OPT");
//        StudentRegistration s21= new StudentRegistration("Muna","Solomon","01-01-1994","FEBRUARY","fpp","CPT");
//
//        StudentRegistration s22= new StudentRegistration("Awet","Tesfamariam","01-01-1997","FEBRUARY","fpp","US");
//        StudentRegistration s23= new StudentRegistration("Sirak","Solomon","01-01-1991","FEBRUARY","mpp","OPT");
//        StudentRegistration s24= new StudentRegistration("Yonas","Tadesse","01-01-1994","FEBRUARY","fpp","CPT");
//
//        StudentRegistration s25= new StudentRegistration("Adam","Kahsay","01-01-1997","FEBRUARY","fpp","OPT");
//        StudentRegistration s26= new StudentRegistration("Aron","Tesfalem","01-01-1991","FEBRUARY","mpp","OPT");
//        StudentRegistration s27= new StudentRegistration("Natnael","Beraki","01-01-1994","FEBRUARY","fpp","CPT");
//
//        StudentRegistration s28= new StudentRegistration("Henos","Kidane","01-01-1997","FEBRUARY","fpp","US");
//        StudentRegistration s29= new StudentRegistration("Meron","Solomon","01-01-1991","FEBRUARY","mpp","OPT");
//        StudentRegistration s30= new StudentRegistration("Tedros","Tesfay","01-01-1994","FEBRUARY","fpp","CPT");
//
//        studentRegistrationService.saveRegistration(s1);studentRegistrationService.saveRegistration(s2);studentRegistrationService.saveRegistration(s3);
//        studentRegistrationService.saveRegistration(s4);studentRegistrationService.saveRegistration(s5);studentRegistrationService.saveRegistration(s6);
//        studentRegistrationService.saveRegistration(s7);studentRegistrationService.saveRegistration(s8);studentRegistrationService.saveRegistration(s9);
//        studentRegistrationService.saveRegistration(s10);studentRegistrationService.saveRegistration(s11);studentRegistrationService.saveRegistration(s12);
//        studentRegistrationService.saveRegistration(s13);studentRegistrationService.saveRegistration(s14);studentRegistrationService.saveRegistration(s15);
//        studentRegistrationService.saveRegistration(s16);studentRegistrationService.saveRegistration(s17);studentRegistrationService.saveRegistration(s18);
//        studentRegistrationService.saveRegistration(s19);studentRegistrationService.saveRegistration(s20);studentRegistrationService.saveRegistration(s21);
//        studentRegistrationService.saveRegistration(s22);studentRegistrationService.saveRegistration(s23);studentRegistrationService.saveRegistration(s24);
//        studentRegistrationService.saveRegistration(s25);studentRegistrationService.saveRegistration(s26);studentRegistrationService.saveRegistration(s27);
//        studentRegistrationService.saveRegistration(s28);studentRegistrationService.saveRegistration(s29);studentRegistrationService.saveRegistration(s30);
//
//
//
//    }
//}
