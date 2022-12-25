package gaur.himanshu.portfolio

import android.util.Log
import androidx.compose.material.TextField
import androidx.compose.runtime.*

@Composable
fun StateManagement() {

    var username = "" // didn't work because it is not compose state

    val userState by mutableStateOf("") // it triggered recomposition but reinitialize during recomposition.

    val state = remember { mutableStateOf("") } // triggered recomposition and also not loose its updated value( not re initialize during recomposition )

    Log.d("TAG", "StateManagement: ${state}")

    TextField(value = state.value, onValueChange = {
        state.value = it
    })

}