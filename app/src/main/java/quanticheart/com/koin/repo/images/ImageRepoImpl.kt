package quanticheart.com.koin.repo.images

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import quanticheart.com.koin.R

class ImageRepoImpl(private val context: Context) : ImageRepo {
    override fun getImageFromGalery(): Bitmap = BitmapFactory.decodeResource(context.resources, R.drawable.link)
}