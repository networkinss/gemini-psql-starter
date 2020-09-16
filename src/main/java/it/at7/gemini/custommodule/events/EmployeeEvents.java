package it.at7.gemini.custommodule.events;

import it.at7.gemini.core.EntityRecord;
import it.at7.gemini.core.events.BeforeInsertField;
import it.at7.gemini.core.events.EventContext;
import it.at7.gemini.core.events.Events;
import it.at7.gemini.core.events.OnUpdateField;

@Events(entityName = "EMPLOYEE")
public class EmployeeEvents {

    @BeforeInsertField(field = "fullName")
    @OnUpdateField(field = "fullName")
    public String getFullName(EventContext eventContext) {
        EntityRecord entityRecord = eventContext.getEntityRecord();
        return entityRecord.get("firstName") + " " + entityRecord.get("lastName");
    }
}
