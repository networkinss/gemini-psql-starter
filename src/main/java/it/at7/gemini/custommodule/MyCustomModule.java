package it.at7.gemini.custommodule;

import it.at7.gemini.core.Module;
import it.at7.gemini.core.ModuleDescription;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@ModuleDescription(
        name = "CUSTOM_MODULE"
)
@ComponentScan("it.at7.gemini.custommodule.core")
@ComponentScan("it.at7.gemini.custommodule.events")
public class MyCustomModule implements Module {
}
