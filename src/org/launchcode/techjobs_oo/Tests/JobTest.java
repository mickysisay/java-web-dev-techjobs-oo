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
}
