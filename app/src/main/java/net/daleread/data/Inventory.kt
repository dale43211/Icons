package net.daleread.data

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

// class Inventory {


@Composable
fun IconDisplay() {
    val nom = "Add"
    var vectArray: Array<ImageVector>
    val vect = arrayOf(
        Icons.Default.Add,
        Icons.Default.AddCircle,
        Icons.Default.AccountBox,
        Icons.Default.AccountCircle,
        Icons.Default.ArrowBack,
        Icons.Default.ArrowDropDown,
        Icons.Default.ArrowForward,
        Icons.Default.Build,
        Icons.Default.Call,
        Icons.Default.Check,
        Icons.Default.CheckCircle,
        Icons.Default.Clear,
        Icons.Default.Close,
        Icons.Default.Create,
        Icons.Default.DateRange,
        Icons.Default.Delete,
        Icons.Default.Done,
        Icons.Default.Email,
        Icons.Default.Edit,
        Icons.Default.Face,
        Icons.Default.Favorite,
        Icons.Default.FavoriteBorder,
        Icons.Default.Home,
        Icons.Default.Info,
        Icons.Default.KeyboardArrowDown,
        Icons.Default.KeyboardArrowUp,
        Icons.Default.KeyboardArrowLeft,
        Icons.Default.KeyboardArrowRight,
        Icons.Default.List,
        Icons.Default.Lock,
        Icons.Default.LocationOn,
        Icons.Default.Menu,
        Icons.Default.MailOutline,
        Icons.Default.MoreVert,
        Icons.Default.Notifications,
        Icons.Default.Person,
        Icons.Default.Phone,
        Icons.Default.Place,
        Icons.Default.PlayArrow,
        Icons.Default.Refresh,
        Icons.Default.Search,
        Icons.Default.Send,
        Icons.Default.Settings,
        Icons.Default.Share,
        Icons.Default.ShoppingCart,
        Icons.Default.Star,
        Icons.Default.ThumbUp,
        Icons.Default.Warning
    )
//        Icons.Default, Icons.Default, Icons.Default, Icons.Default,
    LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 96.dp))
    {
        items(vect.size) {
            Box(
                modifier = Modifier
                    .padding(1.dp)
                    .border(width = 2.dp, color = Color.Transparent),
                contentAlignment = Alignment.Center
            )
            {
                Box(
                    modifier = Modifier
                        .fillMaxSize(.9f)
                        .padding(1.dp)
                        .border(width = 1.dp, color = Color.Blue),
                    contentAlignment = Alignment.Center
                )
                {
                    Column() {
                        Image(
                            imageVector = vect[it], contentDescription = null,
                            modifier = Modifier.offset(x = 12.dp, y = 0.dp)
                        )
                        Text(
                            text = vect[it].name.takeLast(
                                vect[it].name.length - vect[it].name.indexOf(".") - 1
                            )
                        )
                    }

                }
            }

        }
    }

} //    end IconDisplay


