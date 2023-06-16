package com.example.interior3d

import android.content.Context
import android.hardware.Camera

class ModelRenderer(context: Context) : RajawaliRenderer(context) {
    private val camera: Camera = Camera()

    override fun initScene() {
        // Инициализация сцены и настроек камеры
        camera.position = Vector3(0.0, 0.0, 10.0)
        camera.lookAt(Vector3(0.0, 0.0, 0.0))
        currentScene.camera = camera

        // Добавление освещения
        val ambientLight = AmbientLight(0x202020)
        val directionalLight = DirectionalLight(0xffffff, Vector3(1.0, -1.0, 1.0))
        directionalLight.power = 2f

        currentScene.addLight(ambientLight)
        currentScene.addLight(directionalLight)
    }

    fun loadModel(modelPath: String) {
        val objParser = LoaderOBJ(mContext.resources, TextureManager.getInstance(), R.raw.material)
        objParser.parse()
        val objObject = objParser.parsedObject

        // Настройка материала и текстуры
        val material = Material()
        val texture = Texture("texture", R.drawable.texture)
        material.addTexture(texture)

        objObject.material = material
        currentScene.addChild(objObject)
    }
}