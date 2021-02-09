package equality;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalTime;
import java.util.List;

import org.junit.Test;

public class TestCases
{
   @Test
   public void testExercise1()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 40), LocalTime.of(11, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 40), LocalTime.of(11, 0));

      assertTrue(one.equals(two));
      assertTrue(two.equals(one));
   }

   @Test
   public void testExercise2()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
         LocalTime.of(1, 10), LocalTime.of(2, 0));
      List<CourseSection> listCourses = new ArrayList<>();
      listCourses.add(one);
      listCourses.add(two);
      Student s1 = new Student("hilal", "ahmed", 22, listCourses);
      Student s2 = new Student("hilal", "ahmed", 22, listCourses);

      assertTrue(s1.equals(s2));
      assertFalse(one.equals(two));
      assertFalse(two.equals(one));
   }

   @Test
   public void testExercise3()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 40), LocalTime.of(11, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 40), LocalTime.of(11, 0));

      assertEquals(one.hashCode(), two.hashCode());
   }

   @Test
   public void testExercise4()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 34,
         LocalTime.of(9, 10), LocalTime.of(10, 0));

      assertNotEquals(one.hashCode(), two.hashCode());
   }

   @Test
   public void testExercise5()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
              LocalTime.of(1, 10), LocalTime.of(2, 0));
      List<CourseSection> listCourses = new ArrayList<>();
      listCourses.add(one);
      listCourses.add(two);
      List<CourseSection> listCourses1 = new ArrayList<>();
      Student s1 = new Student("hilal", "ahmed", 22, listCourses);
      Student s2 = new Student("hilal", "ahmed", 22, listCourses1);

      assertFalse(s1.equals(s2));
      assertFalse(one.equals(two));
      assertFalse(two.equals(one));
   }

   @Test
   public void testExercise6()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
              LocalTime.of(1, 10), LocalTime.of(2, 0));
      final CourseSection three = new CourseSection("CPE", "203", 35,
              LocalTime.of(1, 10), LocalTime.of(2, 0));
      List<CourseSection> listCourses = new ArrayList<>();
      listCourses.add(one);
      listCourses.add(two);
      List<CourseSection> listCourses1 = new ArrayList<>();
      listCourses1.add(one);
      listCourses1.add(three);
      Student s1 = new Student("hilal", "ahmed", 22, listCourses);
      Student s2 = new Student("hilal", "ahmed", 22, listCourses1);

      assertFalse(s1.equals(s2));
      assertFalse(one.equals(two));
      assertFalse(two.equals(one));
   }

   @Test
   public void testExercise7()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
              LocalTime.of(1, 10), LocalTime.of(2, 0));
      final CourseSection three = new CourseSection("CPE", "203", 35,
              LocalTime.of(1, 10), LocalTime.of(2, 0));
      List<CourseSection> listCourses = new ArrayList<>();
      listCourses.add(one);
      listCourses.add(two);
      /*List<CourseSection> listCourses1 = new ArrayList<>();
      listCourses1.add(one);
      listCourses1.add(three);*/
      Student s1 = new Student("hilal", "aymen", 22, listCourses);
      Student s2 = new Student("hilal", "ahmed", 22, listCourses);

      assertFalse(s1.equals(s2));
      assertFalse(one.equals(two));
      assertFalse(two.equals(one));
   }

   @Test
   public void testExercise8()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
              LocalTime.of(1, 10), LocalTime.of(2, 0));
      final CourseSection three = new CourseSection("CPE", "203", 35,
              LocalTime.of(1, 10), LocalTime.of(2, 0));
      List<CourseSection> listCourses = new ArrayList<>();
      listCourses.add(one);
      listCourses.add(two);
      /*List<CourseSection> listCourses1 = new ArrayList<>();
      listCourses1.add(one);
      listCourses1.add(three);*/
      Student s1 = new Student("hila", "ahmed", 22, listCourses);
      Student s2 = new Student("hilal", "ahmed", 22, listCourses);

      assertFalse(s1.equals(s2));
      assertFalse(one.equals(two));
      assertFalse(two.equals(one));
   }

   @Test
   public void testExercise9()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
              LocalTime.of(1, 10), LocalTime.of(2, 0));
      final CourseSection three = new CourseSection("CSC", "203", 35,
              LocalTime.of(2, 10), LocalTime.of(2, 0));
      List<CourseSection> listCourses = new ArrayList<>();
      listCourses.add(one);
      listCourses.add(two);
      List<CourseSection> listCourses1 = new ArrayList<>();
      listCourses1.add(one);
      listCourses1.add(three);
      Student s1 = new Student("hilal", "ahmed", 22, listCourses);
      Student s2 = new Student("hilal", "ahmed", 22, listCourses1);

      assertFalse(s1.equals(s2));
      assertFalse(one.equals(two));
      assertFalse(two.equals(one));
   }





}
