package com.example.distancetrackerapp

import android.Manifest
import android.content.Context
import androidx.fragment.app.Fragment
import com.example.distancetrackerapp.Contants.PERMISSION_LOCATION_REQUEST_CODE
import com.vmadalin.easypermissions.EasyPermissions

object Permission {
    fun hasLocationPermission(context: Context) =
        EasyPermissions.hasPermissions(
            context,
            Manifest.permission.ACCESS_FINE_LOCATION
        )

    fun requestLocationPermission(fragment:Fragment){
        EasyPermissions.requestPermissions(
            fragment,
            "request permission",
             PERMISSION_LOCATION_REQUEST_CODE,
        Manifest.permission.ACCESS_FINE_LOCATION
        )
    }
}