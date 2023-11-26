package mx.edu.uthermosillo.apps.luisacunat.utilidadesex

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListFragment : Fragment() {

    private var countries : List<Country> = emptyList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_list, container, false)

        initData()
        val recyclerView =
            view.findViewById<RecyclerView>(
                R.id.countriesRecycler
            )
        val adapter = CountryAdapter(countries)
        //Lista anchura completa
        val layoutManager = LinearLayoutManager(container?.context)
        //Cuadricula 2X2
        //val gridLayoutManager = GridLayoutManager(container?.context, 2)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter

        return view
    }

    private fun initData() {

        countries = listOf(
            Country(1, "Mexico", "Mexico City", "North America", "https://cdn.britannica.com/73/2573-004-29818847/Flag-Mexico.jpg", "https://www.unotv.com/uploads/2023/04/zocalo-190000.jpg"),
            Country(2, "United States", "Washington DC", "North America", "https://cdn.britannica.com/33/4833-004-828A9A84/Flag-United-States-of-America.jpg", "https://res.cloudinary.com/hello-tickets/image/upload/c_limit,f_auto,q_auto,w_1300/v1610975959/xm1ipaegfbtieh7d8esr.jpg"),
            Country(3,"France","Paris","Europe","https://cdn.britannica.com/82/682-004-F0B47FCB/Flag-France.jpg", "https://cdn-imgix.headout.com/mircobrands-content/image/15fa043d98f93cfb629799a920ddb1eb-Why%20Visit%20the%20Eiffel%20Tower%20at%20Night%3F.jpeg?auto=format&w=814.9333333333333&h=458.4&q=90&fit=crop&ar=16%3A9"),
            Country(4, "United Kingdom", "London", "Europe", "https://cdn.britannica.com/25/4825-004-F1975B92/Flag-United-Kingdom.jpg", "https://www.fattiretours.com/app/uploads/2022/03/london-big-ben.jpg"),
            Country(5, "Italy", "Rome", "Europe", "https://cdn.britannica.com/59/1759-004-F4175463/Flag-Italy.jpg", "https://cdn.computerhoy.com/sites/navi.axelspringer.es/public/media/image/2023/06/no-te-vas-creer-hay-dentro-torre-pisa-3058064.jpg?tf=3840x"),
            Country(6, "Japan", "Tokyo", "Asia", "https://cdn.britannica.com/91/1791-004-DA3579A5/Flag-Japan.jpg", "https://media.nomadicmatt.com/2023/japanfirsttime1.jpeg"),
            Country(7,"Canada", "Ontario", "North America", "https://cdn.britannica.com/68/7068-004-7848FEB4/Flag-Canada.jpg", "https://www.westernunion.com/blog/wp-content/uploads/2023/01/5-ciudades-para-vivir-en-Canada.jpg"),
            Country(8, "Brazil", "Rio de Janeiro", "South America", "https://cdn.britannica.com/47/6847-004-7D668BB0/Flag-Brazil.jpg", "https://a.cdn-hotels.com/gdcs/production176/d1110/a2bf1ba0-fe12-11e8-a178-0242ac11000d.jpg")
        )
    }
}