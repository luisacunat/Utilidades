package mx.edu.uthermosillo.apps.luisacunat.utilidadesex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CountryAdapter(private var countries: MutableList<Country>): RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {

        val inflador = LayoutInflater.from(parent.context)

        val view = inflador.inflate(R.layout.item_country, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val country = countries[position]
        holder.render(country)

        //aquí se aplica la lógica. ej: onClickListener
    }

    override fun getItemCount(): Int {
        return countries.size
    }

    fun addNewItem(item: Country) {
        countries.add(item)
        notifyItemInserted(countries.size - 1)
    }

    class CountryViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val name: TextView = view.findViewById(R.id.country_name)
        val capital: TextView = view.findViewById(R.id.country_capital)
        val continent: TextView = view.findViewById(R.id.country_continent)
        val flag: ImageView = view.findViewById(R.id.country_flag)
        val image: ImageView = view.findViewById(R.id.country_image)

        fun render(country: Country) {
            name.text = country.name + ", "
            capital.text = country.capital
            continent.text = country.continent
            Picasso.get().load(country.flag).into(flag)
            Picasso.get().load(country.image).into(image)
        }
    }
}