package de.martcre.ballpark.views.tabber;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.martcre.ballpark.views.MainLayout;
import org.apache.metamodel.data.Row;

@PageTitle("Tabber")
@Route(value = "tabber", layout = MainLayout.class)
public class TabberView extends HorizontalLayout {

    private Grid<Row> grid;

    public TabberView() {



    }
}
