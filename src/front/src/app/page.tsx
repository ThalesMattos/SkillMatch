import React from "react";
import { MainNavbar } from "./navbar";
import { Image } from "@nextui-org/react";

export default function Home() {
  return (
    <main className="flex min-h-screen flex-col items-center justify-start p-10">
      <MainNavbar />
      <div className="z-10 w-full max-w-5xl flex flex-col items-center justify-start mt-20">
        <div className="flex justify-center items-start w-full">
          <div className="z-10 w-full max-w-5xl flex flex-col items-center justify-start mt-20">
            <Image
              isZoomed
              className="max-w-full h-auto"
              width={1000}
              alt="SkillMatch Image with Zoom"
              src="images/logo2.png"
            />
            <p className="text-inherit">Conectando talentos ao sucesso, transformando habilidades em oportunidades!</p>
          </div>
        </div>
      </div>
    </main>
  );
}
