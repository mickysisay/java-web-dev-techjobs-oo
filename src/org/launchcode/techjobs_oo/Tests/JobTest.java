package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class JobTest {
    Job test_Job1;
    Job test_Job2;
    Job test_job3;
    Job test_job4;
    Job test_job5;
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Before
    public void createJobObject(){
      test_Job1 = new Job();
      test_Job2 = new Job();
      test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
      test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
      test_job5 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
  @Test
    public void testSettingJobId(){
   assertEquals(test_Job1.getId(),test_Job2.getId()-1);
  }
  @Test
    public void  testJobConstructorSetsAllFields(){
        assert(test_job3 instanceof Job);
    }
    @Test
    public void  testJobsForEquality(){
        assertFalse(test_job3.equals(test_job4));
    }
    @Test
    public void testJobsToString(){
        String testString = "\nID: "+test_job3.getId()+"\nName: "+test_job3.getName()+"\nEmployer: "+test_job3.getEmployer()+
                "\nLocation: "+test_job3.getLocation()+"\nPosition Type: "+test_job3.getPositionType()+"\nCore Competency: "+test_job3.getCoreCompetency()+"\n";
        assertEquals(test_job3.toString(),testString);
    }
    @Test
    public void testJobsToStringEmptyField(){
        String testString = "\nID: "+test_job5.getId()+"\nName: "+test_job5.getName()+"\nEmployer: Data not available"+
                "\nLocation: "+test_job5.getLocation()+"\nPosition Type: "+test_job5.getPositionType()+"\nCore Competency: "+test_job5.getCoreCompetency()+"\n";
        assertEquals(test_job5.toString(),testString);
    }
    @Test
    public void testJobsJustId(){
        assertEquals(test_Job1.toString(),"OOPS! This job does not seem to exist");
    }
}
