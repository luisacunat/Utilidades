package mx.edu.uthermosillo.apps.luisacunat.utilidadesex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class CreateNewCountryFragment : BottomSheetDialogFragment() {

    interface OnItemAddedListener {
        fun onItemAddedListener(newItem: Country)
    }

    private var itemAddedListener: OnItemAddedListener? = null

    fun setOnItemAddedListener(listener: Country) {
        itemAddedListener
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.bsd_new_country, container, false)

        val button = view.findViewById<Button>(R.id.bsd_submit)

        button.setOnClickListener {
            val country = Country(
                9,
                "China",
                "Pekin",
                "Asia",
                "https://cdn.britannica.com/90/7490-004-BAD4AA72/Flag-China.jpg",
                "https://cstad.s3.ap-southeast-2.amazonaws.com/4721_China_WEB_HERO_1.jpg")
            itemAddedListener?.onItemAddedListener(country)
            dismiss()
        }

        return view
    }
}