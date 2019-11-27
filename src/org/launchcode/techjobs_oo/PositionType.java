package org.launchcode.techjobs_oo;


public class PositionType extends JobField {
    public PositionType(String value) {
        super(value);
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        PositionType positionType = (PositionType) o;
        return getId() == positionType.getId();
    }

}
