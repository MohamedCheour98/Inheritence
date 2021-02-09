package equality;

import java.time.LocalTime;

class CourseSection
{
   private final String prefix;
   private final String number;
   private final int enrollment;
   private final LocalTime startTime;
   private final LocalTime endTime;

   public CourseSection(final String prefix, final String number,
      final int enrollment, final LocalTime startTime, final LocalTime endTime)
   {
      this.prefix = prefix;
      this.number = number;
      this.enrollment = enrollment;
      this.startTime = startTime;
      this.endTime = endTime;
   }

   public boolean equals (Object o){

      if (o == null) {return false; }

      if (o.getClass() != this.getClass()) {return false; }

      CourseSection other = (CourseSection) o;

      if (this.prefix == null && other.prefix != null) {return false; }

      if (this.number == null && other.number != null) {return false; }

      if (this.enrollment == 0.0 && other.enrollment != 0.0 ) {return false; }

      if (this.startTime == null && other.startTime != null) {return false; }

      if (this.endTime == null && other.endTime != null) {return false; }

      return this.prefix.equals(other.prefix) && this.number.equals(other.number) && this.enrollment == other.enrollment
              && this.startTime.equals(other.startTime) && this.endTime.equals(other.endTime);

   }

   public int hashCode(){

      int outPut = 2;
      outPut = 7 + (enrollment-prefix.hashCode()) - startTime.hashCode() + endTime.hashCode();

      return outPut;
   }



   // additional likely methods not defined since they are not needed for testing
}
