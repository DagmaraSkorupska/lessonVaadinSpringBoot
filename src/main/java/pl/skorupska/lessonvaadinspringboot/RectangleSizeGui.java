package pl.skorupska.lessonvaadinspringboot;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route
public class RectangleSizeGui extends VerticalLayout {

    private RectangleRepo rectangleRepo;

    private TextField textFieldSize;
    private TextArea textFieldRectangle;
    private Button buttonBigger;
    private Button buttonSmaller;

    @Autowired
    public RectangleSizeGui(RectangleRepo rectangleRepo){
        this.rectangleRepo = rectangleRepo;

        textFieldSize = new TextField("Podaj rozmiar");
        textFieldRectangle = new TextArea("Wynik:");
        buttonBigger = new Button("Pokaz większe");
        buttonSmaller = new Button("Pokaz mniejsze");

        buttonSmaller.addClickListener(click ->textFieldRectangle.setValue(rectangleRepo.getSmallRectangles(Integer.parseInt(textFieldSize.getValue())).toString()));
        buttonBigger.addClickListener(click ->textFieldRectangle.setValue(rectangleRepo.getBigRectangles(Integer.parseInt(textFieldSize.getValue())).toString()));


        add(textFieldSize);
        add(buttonSmaller, buttonBigger);
        add(textFieldRectangle);

    }



}
