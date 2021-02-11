<!DOCTYPE html><html lang="en-US"><head><meta charset="UTF-8"><meta name="viewport" content="width=device-width,height=device-height,initial-scale=1.0"><meta name="apple-mobile-web-app-capable" content="yes"><meta http-equiv="X-UA-Compatible" content="ie=edge"><meta property="og:type" content="website"><meta name="twitter:card" content="summary"><style>.bespoke-marp-note,.bespoke-marp-osc,.bespoke-progress-parent{display:none;transition:none}@media screen{body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>button,body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>button,body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-info-container button{-webkit-appearance:none;-moz-appearance:none;appearance:none;background-color:transparent;border:0;color:inherit;cursor:pointer;font-size:inherit;opacity:.8;outline:none;padding:0;transition:opacity .2s linear;-webkit-tap-highlight-color:transparent}body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>button:disabled,body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>button:disabled,body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-info-container button:disabled{cursor:not-allowed;opacity:.15!important}body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>button:hover,body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>button:hover,body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-info-container button:hover{opacity:1}body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>button:hover:active,body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>button:hover:active,body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-info-container button:hover:active{opacity:.6}body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>button:hover:not(:disabled),body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>button:hover:not(:disabled),body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-info-container button:hover:not(:disabled){transition:none}body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>button[data-bespoke-marp-osc=prev],body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>button[data-bespoke-marp-osc=prev],body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-info-container button.bespoke-marp-presenter-info-page-prev{background:transparent url("data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAxMDAgMTAwIj48cGF0aCBmaWxsPSJub25lIiBzdHJva2U9IiNmZmYiIHN0cm9rZS1saW5lY2FwPSJyb3VuZCIgc3Ryb2tlLWxpbmVqb2luPSJyb3VuZCIgc3Ryb2tlLXdpZHRoPSI1IiBkPSJNNjggOTBMMjggNTBsNDAtNDAiLz48L3N2Zz4=") no-repeat 50%;background-size:contain;overflow:hidden;text-indent:100%;white-space:nowrap}body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>button[data-bespoke-marp-osc=next],body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>button[data-bespoke-marp-osc=next],body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-info-container button.bespoke-marp-presenter-info-page-next{background:transparent url("data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAxMDAgMTAwIj48cGF0aCBmaWxsPSJub25lIiBzdHJva2U9IiNmZmYiIHN0cm9rZS1saW5lY2FwPSJyb3VuZCIgc3Ryb2tlLWxpbmVqb2luPSJyb3VuZCIgc3Ryb2tlLXdpZHRoPSI1IiBkPSJNMzIgOTBsNDAtNDAtNDAtNDAiLz48L3N2Zz4=") no-repeat 50%;background-size:contain;overflow:hidden;text-indent:100%;white-space:nowrap}body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>button[data-bespoke-marp-osc=fullscreen],body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>button[data-bespoke-marp-osc=fullscreen]{background:transparent url("data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAxMDAgMTAwIj48ZGVmcz48c3R5bGU+LmF7ZmlsbDpub25lO3N0cm9rZTojZmZmO3N0cm9rZS1saW5lY2FwOnJvdW5kO3N0cm9rZS1saW5lam9pbjpyb3VuZDtzdHJva2Utd2lkdGg6NXB4fTwvc3R5bGU+PC9kZWZzPjxyZWN0IGNsYXNzPSJhIiB4PSIxMCIgeT0iMjAiIHdpZHRoPSI4MCIgaGVpZ2h0PSI2MCIgcng9IjUuNjciLz48cGF0aCBjbGFzcz0iYSIgZD0iTTQwIDcwSDIwVjUwbTIwIDBMMjAgNzBtNDAtNDBoMjB2MjBtLTIwIDBsMjAtMjAiLz48L3N2Zz4=") no-repeat 50%;background-size:contain;overflow:hidden;text-indent:100%;white-space:nowrap}body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>button.exit[data-bespoke-marp-osc=fullscreen],body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>button.exit[data-bespoke-marp-osc=fullscreen]{background-image:url("data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAxMDAgMTAwIj48ZGVmcz48c3R5bGU+LmF7ZmlsbDpub25lO3N0cm9rZTojZmZmO3N0cm9rZS1saW5lY2FwOnJvdW5kO3N0cm9rZS1saW5lam9pbjpyb3VuZDtzdHJva2Utd2lkdGg6NXB4fTwvc3R5bGU+PC9kZWZzPjxyZWN0IGNsYXNzPSJhIiB4PSIxMCIgeT0iMjAiIHdpZHRoPSI4MCIgaGVpZ2h0PSI2MCIgcng9IjUuNjciLz48cGF0aCBjbGFzcz0iYSIgZD0iTTIwIDUwaDIwdjIwbS0yMCAwbDIwLTIwbTQwIDBINjBWMzBtMjAgMEw2MCA1MCIvPjwvc3ZnPg==")}body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>button[data-bespoke-marp-osc=presenter],body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>button[data-bespoke-marp-osc=presenter]{background:transparent url("data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAxMDAgMTAwIj48ZGVmcz48c3R5bGU+LmF7ZmlsbDpub25lO3N0cm9rZTojZmZmO3N0cm9rZS1saW5lY2FwOnJvdW5kO3N0cm9rZS13aWR0aDo1cHh9PC9zdHlsZT48L2RlZnM+PHBhdGggY2xhc3M9ImEiIGQ9Ik0yMCA2MGgtNWE1IDUgMCAwMS01LTVWMjBhNSA1IDAgMDE1LTVoNjBhNSA1IDAgMDE1IDV2NU0zMCA4NWg2MCIvPjxyZWN0IHg9IjMwIiB5PSIzNSIgd2lkdGg9IjYwIiBoZWlnaHQ9IjQwIiByeD0iNSIgZmlsbD0ibm9uZSIgc3Ryb2tlPSIjZmZmIi8+PHJlY3QgY2xhc3M9ImEiIHg9IjMwIiB5PSIzNSIgd2lkdGg9IjYwIiBoZWlnaHQ9IjQwIiByeD0iNSIvPjxwYXRoIGNsYXNzPSJhIiBkPSJNNDAgNTBoNDBNNDAgNjBoMzAiLz48L3N2Zz4=") no-repeat 50%;background-size:contain;overflow:hidden;text-indent:100%;white-space:nowrap}body,html{height:100%;margin:0}body{background:#000;overflow:hidden}svg.bespoke-marp-slide{content-visibility:hidden;z-index:-1;pointer-events:none;opacity:0}svg.bespoke-marp-slide.bespoke-marp-active{content-visibility:visible;z-index:0;pointer-events:auto;opacity:1}svg.bespoke-marp-slide.bespoke-marp-active.bespoke-marp-active-ready *{-webkit-animation-name:__bespoke_marp__!important;animation-name:__bespoke_marp__!important}@supports not (content-visibility:hidden){svg.bespoke-marp-slide[data-bespoke-marp-load=hideable]{display:none}svg.bespoke-marp-slide[data-bespoke-marp-load=hideable].bespoke-marp-active{display:block}}[data-bespoke-marp-fragment=inactive]{visibility:hidden}body[data-bespoke-view=""] .bespoke-marp-parent,body[data-bespoke-view=next] .bespoke-marp-parent{bottom:0;left:0;position:absolute;right:0;top:0}body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc,body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc{background:rgba(0,0,0,.65);border-radius:7px;bottom:50px;color:#fff;display:block;font-family:Helvetica,Arial,sans-serif;font-size:16px;left:50%;line-height:0;opacity:1;padding:12px;position:absolute;touch-action:manipulation;transform:translateX(-50%);transition:opacity .2s linear;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none;white-space:nowrap;z-index:1;will-change:transform}body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>*,body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>*{margin-left:6px}body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>:first-child,body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>:first-child{margin-left:0}body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>span,body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>span{opacity:.8}body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>span[data-bespoke-marp-osc=page],body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>span[data-bespoke-marp-osc=page]{display:inline-block;min-width:140px;text-align:center}body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>button[data-bespoke-marp-osc=fullscreen],body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>button[data-bespoke-marp-osc=next],body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>button[data-bespoke-marp-osc=presenter],body[data-bespoke-view=""] .bespoke-marp-parent>.bespoke-marp-osc>button[data-bespoke-marp-osc=prev],body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>button[data-bespoke-marp-osc=fullscreen],body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>button[data-bespoke-marp-osc=next],body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>button[data-bespoke-marp-osc=presenter],body[data-bespoke-view=next] .bespoke-marp-parent>.bespoke-marp-osc>button[data-bespoke-marp-osc=prev]{height:32px;line-height:32px;width:32px}body[data-bespoke-view=""] .bespoke-marp-parent.bespoke-marp-inactive,body[data-bespoke-view=next] .bespoke-marp-parent.bespoke-marp-inactive{cursor:none}body[data-bespoke-view=""] .bespoke-marp-parent.bespoke-marp-inactive>.bespoke-marp-osc,body[data-bespoke-view=next] .bespoke-marp-parent.bespoke-marp-inactive>.bespoke-marp-osc{opacity:0;pointer-events:none}body[data-bespoke-view=""] svg.bespoke-marp-slide,body[data-bespoke-view=next] svg.bespoke-marp-slide{height:100%;left:0;position:absolute;top:0;width:100%}body[data-bespoke-view=""] .bespoke-progress-parent{background:#222;display:flex;height:5px;width:100%}body[data-bespoke-view=""] .bespoke-progress-parent+.bespoke-marp-parent{top:5px}body[data-bespoke-view=""] .bespoke-progress-parent .bespoke-progress-bar{flex:0 0 0;background:#0288d1;transition:flex-basis .2s cubic-bezier(0,1,1,1)}body[data-bespoke-view=next]{background:transparent}body[data-bespoke-view=presenter]{background:#161616}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container{font-family:Helvetica,Arial,sans-serif;height:100%;left:0;position:absolute;top:0;width:100%;display:grid;grid-template-columns:2fr 1fr;grid-template-rows:minmax(140px,1fr) 2fr 3em;grid-template-areas:"current next" "current note" "info    note"}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-parent{grid-area:current;position:relative;overflow:hidden}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-parent svg.bespoke-marp-slide{height:calc(100% - 40px);left:20px;position:absolute;pointer-events:none;top:20px;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none;width:calc(100% - 40px)}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-parent svg.bespoke-marp-slide.bespoke-marp-active{filter:drop-shadow(0 3px 10px rgba(0,0,0,.5))}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-next-container{background:#222;cursor:pointer;display:none;grid-area:next;overflow:hidden;position:relative}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-next-container.active{display:block}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-next-container iframe.bespoke-marp-presenter-next{background:transparent;border:0;display:block;filter:drop-shadow(0 3px 10px rgba(0,0,0,.5));height:calc(100% - 40px);left:20px;position:absolute;pointer-events:none;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none;top:20px;width:calc(100% - 40px)}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-note-container{background:#222;color:#eee;grid-area:note}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-note-container .bespoke-marp-note{margin:20px;width:calc(100% - 40px);height:calc(100% - 40px);box-sizing:border-box;font-size:1.1em;overflow:auto;padding-right:3px;white-space:pre-wrap;word-wrap:break-word;scrollbar-width:thin;scrollbar-color:hsla(0,0%,93.3%,.5) transparent}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-note-container .bespoke-marp-note::-webkit-scrollbar{width:6px}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-note-container .bespoke-marp-note::-webkit-scrollbar-track{background:transparent}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-note-container .bespoke-marp-note::-webkit-scrollbar-thumb{background:hsla(0,0%,93.3%,.5);border-radius:6px}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-note-container .bespoke-marp-note:empty{pointer-events:none}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-note-container .bespoke-marp-note.active{display:block}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-note-container .bespoke-marp-note p:first-child{margin-top:0}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-note-container .bespoke-marp-note p:last-child{margin-bottom:0}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-info-container{align-items:center;box-sizing:border-box;color:#eee;display:flex;flex-wrap:nowrap;grid-area:info;justify-content:center;padding:0 10px}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-info-container .bespoke-marp-presenter-info-page,body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-info-container .bespoke-marp-presenter-info-time,body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-info-container .bespoke-marp-presenter-info-timer{display:block;box-sizing:border-box;padding:0 10px;white-space:nowrap;width:100%}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-info-container button{height:1.5em;line-height:1.5em;width:1.5em}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-info-container .bespoke-marp-presenter-info-page{order:2;text-align:center}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-info-container .bespoke-marp-presenter-info-page .bespoke-marp-presenter-info-page-text{display:inline-block;min-width:120px;text-align:center}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-info-container .bespoke-marp-presenter-info-time{color:#999;order:1;text-align:left}body[data-bespoke-view=presenter] .bespoke-marp-presenter-container .bespoke-marp-presenter-info-container .bespoke-marp-presenter-info-timer{color:#999;order:3;text-align:right}}@media print{.bespoke-marp-presenter-info-container,.bespoke-marp-presenter-next-container,.bespoke-marp-presenter-note-container{display:none}}</style><style>@charset "UTF-8";@import url("https://fonts.googleapis.com/css?family=Lato:400,900|Roboto+Mono:400,700&display=swap");div#p>svg>foreignObject>section{width:1280px;height:720px;box-sizing:border-box;overflow:hidden;position:relative;scroll-snap-align:center center}div#p>svg>foreignObject>section:after{bottom:0;content:attr(data-marpit-pagination);padding:inherit;pointer-events:none;position:absolute;right:0}div#p>svg>foreignObject>section:not([data-marpit-pagination]):after{display:none}/* Normalization */div#p>svg>foreignObject>section h1{font-size:2em;margin:0.67em 0}div#p>svg>foreignObject>section video::-webkit-media-controls{will-change:transform}@page{size:1280px 720px;margin:0}@media print{body,html{background-color:#fff;margin:0;page-break-inside:avoid;break-inside:avoid-page}div#p>svg>foreignObject>section{page-break-before:always;break-before:page}div#p>svg>foreignObject>section,div#p>svg>foreignObject>section *{-webkit-print-color-adjust:exact!important;animation-delay:0s!important;animation-duration:0s!important;color-adjust:exact!important;transition:none!important}div#p>svg[data-marpit-svg]{display:block;height:100vh;width:100vw}}div#p>svg>foreignObject>section svg[data-marp-fitting=svg]{display:block;height:auto;width:100%}@supports (-ms-ime-align:auto){div#p>svg>foreignObject>section svg[data-marp-fitting=svg]{position:static}}div#p>svg>foreignObject>section svg[data-marp-fitting=svg].__reflow__{content:""}@supports (-ms-ime-align:auto){div#p>svg>foreignObject>section svg[data-marp-fitting=svg].__reflow__{position:relative}}div#p>svg>foreignObject>section [data-marp-fitting-svg-content]{display:table;white-space:nowrap}div#p>svg>foreignObject>section [data-marp-fitting-svg-content-wrap]{white-space:pre}div#p>svg>foreignObject>section img[data-marp-twemoji]{background:transparent;height:1em;margin:0 .05em 0 .1em;vertical-align:-.1em;width:1em}
/*!
 * Marp / Marpit Gaia theme.
 *
 * @theme gaia
 * @author Yuki Hattori
 *
 * @auto-scaling true
 * @size 4:3 960px 720px
 */div#p>svg>foreignObject>section .hljs{display:block;overflow-x:auto;padding:.5em;background:#000;color:#f8f8f8}div#p>svg>foreignObject>section .hljs-comment,div#p>svg>foreignObject>section .hljs-quote{color:#aeaeae;font-style:italic}div#p>svg>foreignObject>section .hljs-keyword,div#p>svg>foreignObject>section .hljs-selector-tag,div#p>svg>foreignObject>section .hljs-type{color:#e28964}div#p>svg>foreignObject>section .hljs-string{color:#65b042}div#p>svg>foreignObject>section .hljs-subst{color:#daefa3}div#p>svg>foreignObject>section .hljs-link,div#p>svg>foreignObject>section .hljs-regexp{color:#e9c062}div#p>svg>foreignObject>section .hljs-name,div#p>svg>foreignObject>section .hljs-section,div#p>svg>foreignObject>section .hljs-tag,div#p>svg>foreignObject>section .hljs-title{color:#89bdff}div#p>svg>foreignObject>section .hljs-class .hljs-title,div#p>svg>foreignObject>section .hljs-doctag{text-decoration:underline}div#p>svg>foreignObject>section .hljs-bullet,div#p>svg>foreignObject>section .hljs-number,div#p>svg>foreignObject>section .hljs-symbol{color:#3387cc}div#p>svg>foreignObject>section .hljs-params,div#p>svg>foreignObject>section .hljs-template-variable,div#p>svg>foreignObject>section .hljs-variable{color:#3e87e3}div#p>svg>foreignObject>section .hljs-attribute{color:#cda869}div#p>svg>foreignObject>section .hljs-meta{color:#8996a8}div#p>svg>foreignObject>section .hljs-formula{background-color:#0e2231;color:#f8f8f8;font-style:italic}div#p>svg>foreignObject>section .hljs-addition{background-color:#253b22;color:#f8f8f8}div#p>svg>foreignObject>section .hljs-deletion{background-color:#420e09;color:#f8f8f8}div#p>svg>foreignObject>section .hljs-selector-class{color:#9b703f}div#p>svg>foreignObject>section .hljs-selector-id{color:#8b98ab}div#p>svg>foreignObject>section .hljs-emphasis{font-style:italic}div#p>svg>foreignObject>section .hljs-strong{font-weight:700}div#p>svg>foreignObject>section svg[data-marp-fitting=svg]{max-height:580px}div#p>svg>foreignObject>section h1,div#p>svg>foreignObject>section h2,div#p>svg>foreignObject>section h3,div#p>svg>foreignObject>section h4,div#p>svg>foreignObject>section h5,div#p>svg>foreignObject>section h6{margin:.5em 0 0}div#p>svg>foreignObject>section h1 strong,div#p>svg>foreignObject>section h2 strong,div#p>svg>foreignObject>section h3 strong,div#p>svg>foreignObject>section h4 strong,div#p>svg>foreignObject>section h5 strong,div#p>svg>foreignObject>section h6 strong{font-weight:inherit}div#p>svg>foreignObject>section h1{font-size:1.8em}div#p>svg>foreignObject>section h2{font-size:1.5em}div#p>svg>foreignObject>section h3{font-size:1.3em}div#p>svg>foreignObject>section h4{font-size:1.1em}div#p>svg>foreignObject>section h5{font-size:1em}div#p>svg>foreignObject>section h6{font-size:.9em}div#p>svg>foreignObject>section blockquote,div#p>svg>foreignObject>section p{margin:1em 0 0}div#p>svg>foreignObject>section ol>li,div#p>svg>foreignObject>section ul>li{margin:.3em 0 0}div#p>svg>foreignObject>section ol>li>p,div#p>svg>foreignObject>section ul>li>p{margin:.6em 0 0}div#p>svg>foreignObject>section code{display:inline-block;font-family:Roboto Mono,monospace;font-size:.8em;letter-spacing:0;margin:-.1em .15em;padding:.1em .2em;vertical-align:baseline}div#p>svg>foreignObject>section pre{display:block;margin:1em 0 0;min-height:1em;overflow:visible}div#p>svg>foreignObject>section pre code{box-sizing:border-box;margin:0;min-width:100%;padding:.5em;font-size:.7em}div#p>svg>foreignObject>section pre code svg[data-marp-fitting=svg]{max-height:calc(580px - 1em)}div#p>svg>foreignObject>section blockquote{margin:1em 0 0;padding:0 1em;position:relative}div#p>svg>foreignObject>section blockquote:after,div#p>svg>foreignObject>section blockquote:before{content:"“";display:block;font-family:Times New Roman,serif;font-weight:700;position:absolute}div#p>svg>foreignObject>section blockquote:before{top:0;left:0}div#p>svg>foreignObject>section blockquote:after{right:0;bottom:0;transform:rotate(180deg)}div#p>svg>foreignObject>section blockquote>:first-child{margin-top:0}div#p>svg>foreignObject>section mark{background:transparent}div#p>svg>foreignObject>section table{border-spacing:0;border-collapse:collapse;margin:1em 0 0}div#p>svg>foreignObject>section table td,div#p>svg>foreignObject>section table th{padding:.2em .4em;border-width:1px;border-style:solid}div#p>svg>foreignObject>section{background-image:linear-gradient(135deg,hsla(0,0%,53.3%,0),hsla(0,0%,53.3%,.02) 50%,hsla(0,0%,100%,0) 0,hsla(0,0%,100%,.05));font-size:35px;font-family:Lato,Avenir Next,Avenir,Trebuchet MS,Segoe UI,sans-serif;height:720px;line-height:1.35;letter-spacing:1.25px;padding:70px;width:1280px;word-wrap:break-word;color:#455a64;background-color:#fff8e1}div#p>svg>foreignObject>section{--marpit-root-font-size:35px}div#p>svg>foreignObject>section>:first-child,div#p>svg>foreignObject>section>header:first-child+*{margin-top:0}div#p>svg>foreignObject>section a,div#p>svg>foreignObject>section mark{color:#0288d1}div#p>svg>foreignObject>section code{background:#6a7a7d;color:#fff8e1}div#p>svg>foreignObject>section h1 strong,div#p>svg>foreignObject>section h2 strong,div#p>svg>foreignObject>section h3 strong,div#p>svg>foreignObject>section h4 strong,div#p>svg>foreignObject>section h5 strong,div#p>svg>foreignObject>section h6 strong{color:#0288d1}div#p>svg>foreignObject>section pre>code{background:#455a64}div#p>svg>foreignObject>section blockquote:after,div#p>svg>foreignObject>section blockquote:before,div#p>svg>foreignObject>section footer,div#p>svg>foreignObject>section header,div#p>svg>foreignObject>section section:after{color:#6a7a7d}div#p>svg>foreignObject>section table td,div#p>svg>foreignObject>section table th{border-color:#455a64}div#p>svg>foreignObject>section table thead th{background:#455a64;color:#fff8e1}div#p>svg>foreignObject>section table tbody>tr:nth-child(odd) td,div#p>svg>foreignObject>section table tbody>tr:nth-child(odd) th{background:rgba(69,90,100,.1)}div#p>svg>foreignObject>section.invert{color:#fff8e1;background-color:#455a64}div#p>svg>foreignObject>section.invert a,div#p>svg>foreignObject>section.invert mark{color:#81d4fa}div#p>svg>foreignObject>section.invert code{background:#dad8c8;color:#455a64}div#p>svg>foreignObject>section.invert h1 strong,div#p>svg>foreignObject>section.invert h2 strong,div#p>svg>foreignObject>section.invert h3 strong,div#p>svg>foreignObject>section.invert h4 strong,div#p>svg>foreignObject>section.invert h5 strong,div#p>svg>foreignObject>section.invert h6 strong{color:#81d4fa}div#p>svg>foreignObject>section.invert pre>code{background:#fff8e1}div#p>svg>foreignObject>section.invert blockquote:after,div#p>svg>foreignObject>section.invert blockquote:before,div#p>svg>foreignObject>section.invert footer,div#p>svg>foreignObject>section.invert header,div#p>svg>foreignObject>section.invert section:after{color:#dad8c8}div#p>svg>foreignObject>section.invert table td,div#p>svg>foreignObject>section.invert table th{border-color:#fff8e1}div#p>svg>foreignObject>section.invert table thead th{background:#fff8e1;color:#455a64}div#p>svg>foreignObject>section.invert table tbody>tr:nth-child(odd) td,div#p>svg>foreignObject>section.invert table tbody>tr:nth-child(odd) th{background:rgba(255,248,225,.1)}div#p>svg>foreignObject>section.gaia{color:#fff8e1;background-color:#0288d1}div#p>svg>foreignObject>section.gaia a,div#p>svg>foreignObject>section.gaia mark{color:#81d4fa}div#p>svg>foreignObject>section.gaia code{background:#cce2de;color:#0288d1}div#p>svg>foreignObject>section.gaia h1 strong,div#p>svg>foreignObject>section.gaia h2 strong,div#p>svg>foreignObject>section.gaia h3 strong,div#p>svg>foreignObject>section.gaia h4 strong,div#p>svg>foreignObject>section.gaia h5 strong,div#p>svg>foreignObject>section.gaia h6 strong{color:#81d4fa}div#p>svg>foreignObject>section.gaia pre>code{background:#fff8e1}div#p>svg>foreignObject>section.gaia blockquote:after,div#p>svg>foreignObject>section.gaia blockquote:before,div#p>svg>foreignObject>section.gaia footer,div#p>svg>foreignObject>section.gaia header,div#p>svg>foreignObject>section.gaia section:after{color:#cce2de}div#p>svg>foreignObject>section.gaia table td,div#p>svg>foreignObject>section.gaia table th{border-color:#fff8e1}div#p>svg>foreignObject>section.gaia table thead th{background:#fff8e1;color:#0288d1}div#p>svg>foreignObject>section.gaia table tbody>tr:nth-child(odd) td,div#p>svg>foreignObject>section.gaia table tbody>tr:nth-child(odd) th{background:rgba(255,248,225,.1)}div#p>svg>foreignObject>section.lead{display:flex;flex-direction:column;flex-wrap:nowrap;justify-content:center}div#p>svg>foreignObject>section.lead h1,div#p>svg>foreignObject>section.lead h2,div#p>svg>foreignObject>section.lead h3,div#p>svg>foreignObject>section.lead h4,div#p>svg>foreignObject>section.lead h5,div#p>svg>foreignObject>section.lead h6{text-align:center}div#p>svg>foreignObject>section.lead h1 svg[data-marp-fitting=svg],div#p>svg>foreignObject>section.lead h2 svg[data-marp-fitting=svg],div#p>svg>foreignObject>section.lead h3 svg[data-marp-fitting=svg],div#p>svg>foreignObject>section.lead h4 svg[data-marp-fitting=svg],div#p>svg>foreignObject>section.lead h5 svg[data-marp-fitting=svg],div#p>svg>foreignObject>section.lead h6 svg[data-marp-fitting=svg]{--preserve-aspect-ratio:xMidYMid meet}div#p>svg>foreignObject>section.lead p{text-align:center}div#p>svg>foreignObject>section.lead blockquote>h1,div#p>svg>foreignObject>section.lead blockquote>h2,div#p>svg>foreignObject>section.lead blockquote>h3,div#p>svg>foreignObject>section.lead blockquote>h4,div#p>svg>foreignObject>section.lead blockquote>h5,div#p>svg>foreignObject>section.lead blockquote>h6,div#p>svg>foreignObject>section.lead blockquote>p{text-align:left}div#p>svg>foreignObject>section.lead blockquote svg[data-marp-fitting=svg]:not([data-marp-fitting-math]){--preserve-aspect-ratio:xMinYMin meet}div#p>svg>foreignObject>section.lead ol>li>p,div#p>svg>foreignObject>section.lead ul>li>p{text-align:left}div#p>svg>foreignObject>section.lead table{margin-left:auto;margin-right:auto}div#p>svg>foreignObject>section:after,div#p>svg>foreignObject>section footer,div#p>svg>foreignObject>section header{box-sizing:border-box;font-size:66%;height:70px;line-height:50px;overflow:hidden;padding:10px 25px;position:absolute}div#p>svg>foreignObject>section:after{--marpit-root-font-size:66%}div#p>svg>foreignObject>section header{top:0}div#p>svg>foreignObject>section footer,div#p>svg>foreignObject>section header{left:0;right:0}div#p>svg>foreignObject>section footer{bottom:0}div#p>svg>foreignObject>section:after{right:0;bottom:0;font-size:80%}div#p>svg>foreignObject>section:after{--marpit-root-font-size:80%}div#p>svg>foreignObject>section[data-marpit-advanced-background=background]{display:block!important;padding:0!important}div#p>svg>foreignObject>section[data-marpit-advanced-background=background]:after,div#p>svg>foreignObject>section[data-marpit-advanced-background=background]:before,div#p>svg>foreignObject>section[data-marpit-advanced-background=content]:after,div#p>svg>foreignObject>section[data-marpit-advanced-background=content]:before{display:none!important}div#p>svg>foreignObject>section[data-marpit-advanced-background=background]>div[data-marpit-advanced-background-container]{all:initial;display:flex;flex-direction:row;height:100%;overflow:hidden;width:100%}div#p>svg>foreignObject>section[data-marpit-advanced-background=background]>div[data-marpit-advanced-background-container][data-marpit-advanced-background-direction=vertical]{flex-direction:column}div#p>svg>foreignObject>section[data-marpit-advanced-background=background][data-marpit-advanced-background-split]>div[data-marpit-advanced-background-container]{width:var(--marpit-advanced-background-split,50%)}div#p>svg>foreignObject>section[data-marpit-advanced-background=background][data-marpit-advanced-background-split=right]>div[data-marpit-advanced-background-container]{margin-left:calc(100% - var(--marpit-advanced-background-split, 50%))}div#p>svg>foreignObject>section[data-marpit-advanced-background=background]>div[data-marpit-advanced-background-container]>figure{all:initial;background-position:center;background-repeat:no-repeat;background-size:cover;flex:auto;margin:0}div#p>svg>foreignObject>section[data-marpit-advanced-background=content],div#p>svg>foreignObject>section[data-marpit-advanced-background=pseudo]{background:transparent!important}div#p>svg>foreignObject>section[data-marpit-advanced-background=pseudo],div#p>svg[data-marpit-svg]>foreignObject[data-marpit-advanced-background=pseudo]{pointer-events:none!important}div#p>svg>foreignObject>section[data-marpit-advanced-background-split]{width:100%;height:100%}</style></head><body><div class="bespoke-marp-osc"><button data-bespoke-marp-osc="prev" tabindex="-1" title="Previous slide">Previous slide</button><span data-bespoke-marp-osc="page"></span><button data-bespoke-marp-osc="next" tabindex="-1" title="Next slide">Next slide</button><button data-bespoke-marp-osc="fullscreen" tabindex="-1" title="Toggle fullscreen (f)">Toggle fullscreen</button><button data-bespoke-marp-osc="presenter" tabindex="-1" title="Open presenter view (p)">Open presenter view</button></div><div id="p"><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="1" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;--marpit-advanced-background-split:50%;" data-marpit-advanced-background="background" data-marpit-advanced-background-split="right"><div data-marpit-advanced-background-container="true" data-marpit-advanced-background-direction="horizontal"><figure style="background-image:url(&quot;coffee.gif&quot;);"></figure></div></section></foreignObject><foreignObject width="50%" height="720"><section id="1" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="1" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;--marpit-advanced-background-split:50%;" data-marpit-advanced-background="content" data-marpit-advanced-background-split="right">
<header><strong>Preparation Java</strong></header>

<h1>Java SMI5</h1>

<h2>Join this link</h2>
<p>[<a href="https://app.sli.do/event/ex3esarj">https://app.sli.do/event/ex3esarj</a>]</p>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject><foreignObject width="1280" height="720" data-marpit-advanced-background="pseudo"><section class="lead" style="" data-marpit-advanced-background="pseudo" data-marpit-pagination="1" data-marpit-pagination-total="76"></section></foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="2" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="2" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<p>Encapsulation in Python<br />
self.__data</p>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="3" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="3" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Class</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="4" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="4" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>public class Dog {
    String breed;
    int age;
    String color;

    void barking() {
    }

    void hungry() {
    }

    void sleeping() {
    }
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="5" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="5" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Variable types</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="6" data-marpit-fragments="3" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="6" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<ul>
<li data-marpit-fragment="1">
<p><strong>Local variables</strong>: Variables defined inside methods, constructors or blocks are called local variables. The variable will be declared and initialized within the method and the variable will be destroyed when the method has completed.</p>
</li>
<li data-marpit-fragment="2">
<p><strong>Instance variables</strong>: Instance variables are variables within a class but outside its methods. These variables are initialized when the class is instantiated. Instance variables can be accessed from inside any method, constructor or blocks of that particular class.</p>
</li>
<li data-marpit-fragment="3">
<p><strong>Class variables</strong>: Class variables are variables declared within a class, outside any method, with the static keyword.</p>
</li>
</ul>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="7" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="7" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Constructors</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="8" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="8" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>    public class Puppy {
        public Puppy() {
        }

        public Puppy(String name) {
            // This constructor has one parameter, name.
        }
    }
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="9" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="9" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Creating an Object</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="10" data-marpit-fragments="3" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="10" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<ul>
<li data-marpit-fragment="1">
<p><strong>Declaration</strong>: A variable declaration with a variable name with an object type.</p>
</li>
<li data-marpit-fragment="2">
<p><strong>Instantiation</strong>: The 'new' keyword is used to create the object.</p>
</li>
<li data-marpit-fragment="3">
<p><strong>Initialization</strong> − The 'new' keyword is followed by a call to a constructor. This call initializes the new object.</p>
</li>
</ul>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="11" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="11" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>public class Puppy {
    public Puppy(String name) {
        // This constructor has one parameter, name.
        System.out.println(&quot;Passed Name is :&quot; + name );
    }

public static void main(String []args) {
        // Following statement would create an object myPuppy
        Puppy myPuppy = new Puppy( &quot;tommy&quot; );
    }
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="12" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="12" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Accessing Instance Variables and Methods</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="13" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="13" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>/* First create an object */
ObjectReference = new Constructor();

/* Now call a variable as follows */
ObjectReference.variableName;

/* Now you can call a class method as follows */
ObjectReference.MethodName();
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="14" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="14" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>    public class Puppy {
        int puppyAge;

        public Puppy(String name) {
            // This constructor has one parameter, name.
            System.out.println(&quot;Name chosen is :&quot; + name );
        }

        public void setAge( int age ) {
            puppyAge = age;
        }

        public int getAge( ) {
            System.out.println(&quot;Puppy's age is :&quot; + puppyAge );
            return puppyAge;
        }

        public static void main(String []args) {
            /* Object creation */
            Puppy myPuppy = new Puppy( &quot;tommy&quot; );

            /* Call class method to set puppy's age */
        myPuppy.setAge( 2 );

            /* Call another class method to get puppy's age */
            myPuppy.getAge( );

            /* You can access instance variable as follows as well */
            System.out.println(&quot;Variable Value :&quot; +     myPuppy.puppyAge );
        }
    }
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="15" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="15" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>No argument Constructors</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="16" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="16" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>    Public class MyClass {
        Int num;
        MyClass() {
            num = 100;
        }
    }
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="17" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="17" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Parameterized Constructors</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="18" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="18" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>// A simple constructor.
class MyClass {
    int x;

    // Following is the constructor
    MyClass(int i ) {
        x = i;
    }
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="19" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="19" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Primitive Data Types</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="20" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="20" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>char c;
boolean b; 
double d; 
float f; 
long l; 
int i;
short sh; 
byte by;
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="21" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="21" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Reference Datatypes</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="22" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="22" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<p>Classes</p>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="23" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="23" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Local Variables</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="24" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="24" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>public class Test {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println(&quot;Puppy age is : &quot; + age);
    }

    public static void main(String args[]) {
        Test test = new Test();
        test.pupAge();
    }
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="25" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="25" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Instance Variables</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="26" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="26" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>import java.io.*;
public class Employee {

    // this instance variable is visible for any child class.
    public String name;

    // salary  variable is visible in Employee class only.
    private double salary;

    // The name variable is assigned in the constructor.
    public Employee (String empName) {
    name = empName;
    }

    // The salary variable is assigned a value.
    public void setSalary(double empSal) {
    salary = empSal;
    }

    // This method prints the employee details.
    public void printEmp() {
    System.out.println(&quot;name  : &quot; + name );
    System.out.println(&quot;salary :&quot; + salary);
    }

    public static void main(String args[]) {
    Employee empOne = new Employee(&quot;Ransika&quot;);
    empOne.setSalary(1000);
    empOne.printEmp();
    }
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="27" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="27" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Class/Static Variables</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="28" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="28" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>import java.io.*;
public class Employee {

    // salary  variable is a private static variable
    private static double salary;

    // DEPARTMENT is a constant
    public static final String DEPARTMENT = &quot;Development &quot;;

    public static void main(String args[]) {
        salary = 1000;
        System.out.println(DEPARTMENT + &quot;average salary:&quot; + salary);
    }
</span></span></foreignObject></svg></code></pre>
<p>}</p>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="29" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="29" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Access Control Modifiers</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="30" data-marpit-fragments="4" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="30" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<ul>
<li data-marpit-fragment="1">Visible to the package, the default. No modifiers are needed.</li>
<li data-marpit-fragment="2">Visible to the class only (private).</li>
<li data-marpit-fragment="3">Visible to the world (public).</li>
<li data-marpit-fragment="4">Visible to the package and all subclasses (protected).</li>
</ul>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="31" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;" data-marpit-advanced-background="background"><div data-marpit-advanced-background-container="true" data-marpit-advanced-background-direction="horizontal"><figure style="background-image:url(&quot;encap_difference.png&quot;);background-size:70%;"></figure></div></section></foreignObject><foreignObject width="1280" height="720"><section id="31" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="31" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;" data-marpit-advanced-background="content">
<header><strong>Preparation Java</strong></header>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject><foreignObject width="1280" height="720" data-marpit-advanced-background="pseudo"><section class="lead" style="" data-marpit-advanced-background="pseudo" data-marpit-pagination="31" data-marpit-pagination-total="76"></section></foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="32" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="32" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Non-Access Modifiers</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="33" data-marpit-fragments="4" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="33" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<ul>
<li data-marpit-fragment="1">
<p>The static modifier for creating class methods and variables.</p>
</li>
<li data-marpit-fragment="2">
<p>The final modifier for finalizing the implementations of classes, methods, and variables.</p>
</li>
<li data-marpit-fragment="3">
<p>The abstract modifier for creating abstract classes and methods.</p>
</li>
<li data-marpit-fragment="4">
<p>The synchronized and volatile modifiers, which are used for threads.</p>
</li>
</ul>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="34" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="34" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Loop</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="35" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="35" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>int [] numbers = {10, 20, 30, 40, 50};
for(int x : numbers ) {
    System.out.print( x );
    System.out.print(&quot;,&quot;);
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="36" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="36" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>String [] names = {&quot;James&quot;, &quot;Larry&quot;, &quot;Tom&quot;, &quot;Lacy&quot;};

for( String name : names ) {
    System.out.print( name );
    System.out.print(&quot;,&quot;);
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="37" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="37" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Conditional Statement</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="38" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="38" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>if(condition1)
{  
    //code for if condition1 is true  
}
else if(condition2)
{  
    //code for if condition2 is true  
}  
else if(condition3)
{  
    //code for if condition3 is true  
}  
else
{  
    //code for all the false conditions   
}    
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="39" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="39" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>Exp1 ? Exp2 : Exp3;
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="40" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="40" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Methods</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="41" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="41" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>return-type methodName(parameter-list){
    //body of method
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="42" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="42" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Java is Strictly Pass by Value</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="43" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="43" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Iheritance: IS-A Relationship</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="44" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="44" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>public class Animal{
}
public class Mammal extends Animal{
}
public class Reptile extends Animal{
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="45" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="45" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Aggregation: HAS-A relationship</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="46" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="46" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>public class Vehicle{}
public class Speed{}
public class Van extends Vehicle {
    // Van has Speed
    private Speed sp;
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="47" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;" data-marpit-advanced-background="background"><div data-marpit-advanced-background-container="true" data-marpit-advanced-background-direction="horizontal"><figure style="background-image:url(&quot;iheritance.jpg&quot;);background-size:700px auto;"></figure></div></section></foreignObject><foreignObject width="1280" height="720"><section id="47" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="47" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;" data-marpit-advanced-background="content">
<header><strong>Preparation Java</strong></header>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject><foreignObject width="1280" height="720" data-marpit-advanced-background="pseudo"><section class="lead" style="" data-marpit-advanced-background="pseudo" data-marpit-pagination="47" data-marpit-pagination-total="76"></section></foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="48" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="48" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Polymorphism</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="49" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="49" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h3>Overriding</h3>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="50" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="50" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>class Animal {
    public void move() {
        System.out.println(&quot;Animals can move&quot;);
        }
}
class Dog extends Animal {
    public void move() {
        System.out.println(&quot;Dogs can walk and run&quot;);
    }
    public void bark() {
        System.out.println(&quot;Dogs can bark&quot;);
    }
}
public class TestDog {
    public static void main(String args[]) {
        Animal a = new Animal();   // Animal reference and object
        Animal b = new Dog();   // Animal reference but Dog object
        a.move();   // runs the method in Animal class
        b.move();   // runs the method in Dog class
        b.bark();
    }
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="51" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="51" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h3>super keyword</h3>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="52" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="52" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>class Animal {
    public void move() {
        System.out.println(&quot;Animals can move&quot;);
    }
}

class Dog extends Animal {
    public void move() {
        super.move();   // invokes the super class method
        System.out.println(&quot;Dogs can walk and run&quot;);
    }
}

public class TestDog {
    public static void main(String args[]) {
        Animal b = new Dog();   // Animal reference but Dog object
        b.move();   // runs the method in Dog class
    }
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="53" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="53" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Abstraction</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="54" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="54" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>public abstract class Employee {
    private String name;
    private String address;
    private int number;
    
    public abstract double computePay();
    // Remainder of class definition
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="55" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="55" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>public class Salary extends Employee {
    private double salary;   // Annual salary
    
    public double computePay() {
        System.out.println(&quot;Computing salary pay for &quot; + getName());
        return salary/52;
    }
    // Remainder of class definition
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="56" data-marpit-fragments="2" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="56" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<p>Declaring a method as abstract has two consequences:</p>
<ul>
<li data-marpit-fragment="1">
<p>The class containing it must be declared as abstract.</p>
</li>
<li data-marpit-fragment="2">
<p>Any class inheriting the current class must either override the abstract method or declare itself as abstract.</p>
</li>
</ul>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="57" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="57" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Association</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="58" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;" data-marpit-advanced-background="background"><div data-marpit-advanced-background-container="true" data-marpit-advanced-background-direction="horizontal"><figure style="background-image:url(&quot;assoc.png&quot;);background-size:50% auto;"></figure></div></section></foreignObject><foreignObject width="1280" height="720"><section id="58" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="58" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;" data-marpit-advanced-background="content">
<header><strong>Preparation Java</strong></header>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject><foreignObject width="1280" height="720" data-marpit-advanced-background="pseudo"><section class="lead" style="" data-marpit-advanced-background="pseudo" data-marpit-pagination="58" data-marpit-pagination-total="76"></section></foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="59" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="59" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>import java.io.*; 
    
// class bank 
class Bank  
    { 
        private String name; 
        
        // bank name 
        Bank(String name) 
        { 
            this.name = name; 
        } 
        
        public String getBankName() 
        { 
            return this.name; 
        } 
    }  
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="60" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="60" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>// employee class  
class Employee { 
        private String name; 
        // employee name  
        Employee(String name)  
        { 
            this.name = name; 
        } 
        public String getEmployeeName() 
        { 
            return this.name; 
        }  
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="61" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="61" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>// Association between both the  
// classes in main method 
class Association{ 
    public static void main (String[] args){ 
            Bank bank = new Bank(&quot;Axis&quot;); 
            Employee emp = new Employee(&quot;Neha&quot;); 
            
            System.out.println(emp.getEmployeeName() +  
                &quot; is employee of &quot; + bank.getBankName()); 
        } 
    } 
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="62" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="62" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Aggregation</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="63" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;" data-marpit-advanced-background="background"><div data-marpit-advanced-background-container="true" data-marpit-advanced-background-direction="horizontal"><figure style="background-image:url(&quot;aggrega.jpeg&quot;);background-size:60% auto;"></figure></div></section></foreignObject><foreignObject width="1280" height="720"><section id="63" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="63" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;" data-marpit-advanced-background="content">
<header><strong>Preparation Java</strong></header>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject><foreignObject width="1280" height="720" data-marpit-advanced-background="pseudo"><section class="lead" style="" data-marpit-advanced-background="pseudo" data-marpit-pagination="63" data-marpit-pagination-total="76"></section></foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="64" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="64" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>// Java program to illustrate 
//the concept of Aggregation. 
import java.io.*; 
import java.util.*; 
// student class 
class Student{ 
        String name; 
        int id ; 
        String dept; 
        Student(String name, int id, String dept){ 
            this.name = name; 
            this.id = id; 
            this.dept = dept; 
        } 
    } 
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="65" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="65" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>    /* Department class contains list of student 
    Objects. It is associated with student 
    class through its Object(s). */
    class Department{ 
        String name; 
        private List&lt;Student&gt; students; 
        Department(String name, List&lt;Student&gt; students){ 
            this.name = name; 
            this.students = students; 
            
        } 
        public List&lt;Student&gt; getStudents(){ 
            return students; 
        } 
    } 
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="66" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="66" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>    /* Institute class contains list of Department 
    Objects. It is asoociated with Department 
    class through its Object(s).*/
    class Institute{ 
        String instituteName; 
        private List&lt;Department&gt; departments; 
        Institute(String instituteName List&lt;Department&gt; departments){ 
            this.instituteName = instituteName; 
            this.departments = departments; 
        }
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="67" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="67" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>        // count total students of all departments 
        // in a given institute  
        public int getTotalStudentsInInstitute(){ 
            int noOfStudents = 0; 
            List&lt;Student&gt; students;  
            for(Department dept : departments){ 
                students = dept.getStudents(); 
                for(Student s : students) { 
                    noOfStudents++; 
                } 
            } 
            return noOfStudents; 
        } 
    }  
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="68" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="68" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>    // main method 
    class GFG 
    { 
        public static void main (String[] args){ 
            Student s1 = new Student(&quot;Mia&quot;, 1, &quot;CSE&quot;); 
            Student s2 = new Student(&quot;Priya&quot;, 2, &quot;CSE&quot;); 
            Student s3 = new Student(&quot;John&quot;, 1, &quot;EE&quot;); 
            Student s4 = new Student(&quot;Rahul&quot;, 2, &quot;EE&quot;); 
            // making a List of  
            // CSE Students. 
            List &lt;Student&gt; cse_students = new ArrayList&lt;Student&gt;(); 
            cse_students.add(s1); 
            cse_students.add(s2); 
            // making a List of  
            // EE Students 
            List &lt;Student&gt; ee_students = new ArrayList&lt;Student&gt;(); 
            ee_students.add(s3); 
            ee_students.add(s4);
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="69" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="69" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>            Department CSE = new Department(&quot;CSE&quot;, cse_students); 
            Department EE = new Department(&quot;EE&quot;, ee_students); 
            List &lt;Department&gt; departments = new ArrayList&lt;Department&gt;(); 
            departments.add(CSE); 
            departments.add(EE); 
            // creating an instance of Institute. 
            Institute institute = new Institute(&quot;BITS&quot;, departments); 
            System.out.print(&quot;Total students in institute: &quot;); 
            System.out.print(institute.getTotalStudentsInInstitute()); 
        } 
    } 
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="70" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="70" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>Composition</h2>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="71" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;" data-marpit-advanced-background="background"><div data-marpit-advanced-background-container="true" data-marpit-advanced-background-direction="horizontal"><figure style="background-image:url(&quot;compo.jpeg&quot;);background-size:60% auto;"></figure></div></section></foreignObject><foreignObject width="1280" height="720"><section id="71" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="71" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;" data-marpit-advanced-background="content">
<header><strong>Preparation Java</strong></header>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject><foreignObject width="1280" height="720" data-marpit-advanced-background="pseudo"><section class="lead" style="" data-marpit-advanced-background="pseudo" data-marpit-pagination="71" data-marpit-pagination-total="76"></section></foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="72" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="72" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>// Java program to illustrate the 
// difference between Aggregation 
// Composition. 

import java.io.*; 

// Engine class which will  
// be used by car. so 'Car' 
// class will have a field  
// of Engine type. 
class Engine{
    // starting an engine.
    public void work(){ 
        System.out.println(&quot;Engine of car has been started &quot;);
    }
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="73" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="73" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>// Engine class 
final class Car  
{ 
    // For a car to move,  
    // it need to have a engine. 
    private final Engine engine; // Composition 
    //private Engine engine;     // Aggregation 
    
    Car(Engine engine) 
    { 
        this.engine = engine; 
    } 
    
    // car start moving by starting engine 
    public void move()  
    { 
        
        //if(engine != null) 
        { 
            engine.work(); 
            System.out.println(&quot;Car is moving &quot;); 
        } 
    }
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="74" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="74" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<pre><code><svg data-marp-fitting="svg" data-marp-fitting-code><foreignObject><span data-marp-fitting-svg-content><span data-marp-fitting-svg-content-wrap>class GFG { 
    public static void main (String[] args)  
    { 
      
        // making an engine by creating  
        // an instance of Engine class. 
        Engine engine = new Engine(); 
        
        // Making a car with engine. 
        // so we are passing a engine  
        // instance as an argument while 
        // creating instace of Car. 
        Car car = new Car(engine); 
        car.move(); 
        
    } 
}
</span></span></foreignObject></svg></code></pre>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="75" data-marpit-fragments="3" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="75" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h4><strong>Aggregation vs Composition</strong></h4>
<ul>
<li data-marpit-fragment="1">Dependency: Aggregation implies a relationship where the child can exist independently of the parent. For example, Bank and Employee, delete the Bank and the Employee still exist. whereas Composition implies a relationship where the child cannot exist independent of the parent. Example: Human and heart, heart don’t exist separate to a Human</li>
<li data-marpit-fragment="2">Type of Relationship: Aggregation relation is “has-a” and composition is “part-of” relation.</li>
<li data-marpit-fragment="3">Type of association: Composition is a strong Association whereas Aggregation is a weak Association.</li>
</ul>
<footer>Taha Bouhsine</footer>
</section>
</foreignObject></svg><svg data-marpit-svg="" viewBox="0 0 1280 720"><foreignObject width="1280" height="720"><section id="76" data-class="lead" data-paginate="true" data-background-image="url('hero-background.jpg')" data-header="**Preparation Java**" data-footer="Taha Bouhsine" data-theme="gaia" class="lead" data-marpit-pagination="76" data-marpit-pagination-total="76" style="--class:lead;--paginate:true;--background-image:url('hero-background.jpg');--header:**Preparation Java**;--footer:Taha Bouhsine;--theme:gaia;background-image:url('hero-background.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<header><strong>Preparation Java</strong></header>
<h2>References</h2>
<p>[<a href="https://www.tutorialspoint.com/java/java_quick_guide.htm">https://www.tutorialspoint.com/java/java_quick_guide.htm</a>]<br />
[<a href="https://www.studytonight.com/java/overview-of-java.php">https://www.studytonight.com/java/overview-of-java.php</a>]<br />
[BOOK: Head First Java, 2nd Edition]</p>
<footer>Taha Bouhsine</footer>
</section>
<script>!function(){"use strict";const t="marpitSVGPolyfill:setZoomFactor,",e=Symbol();let r,o;function n(n){const i="object"==typeof n&&n.target||document,a="object"==typeof n?n.zoom:n;window[e]||(Object.defineProperty(window,e,{configurable:!0,value:!0}),window.addEventListener("message",(({data:e,origin:r})=>{if(r===window.origin)try{if(e&&"string"==typeof e&&e.startsWith(t)){const[,t]=e.split(","),r=Number.parseFloat(t);Number.isNaN(r)||(o=r)}}catch(t){console.error(t)}})));let l=!1;Array.from(i.querySelectorAll("svg[data-marpit-svg]"),(t=>{var e,n,i,s;t.style.transform||(t.style.transform="translateZ(0)");const c=a||o||t.currentScale||1;r!==c&&(r=c,l=c);const d=t.getBoundingClientRect(),{length:u}=t.children;for(let r=0;r<u;r+=1){const o=t.children[r],a=o.getScreenCTM();if(a){const t=null!==(n=null===(e=o.x)||void 0===e?void 0:e.baseVal.value)&&void 0!==n?n:0,r=null!==(s=null===(i=o.y)||void 0===i?void 0:i.baseVal.value)&&void 0!==s?s:0,l=o.firstElementChild,{style:u}=l;u.transformOrigin||(u.transformOrigin=`${-t}px ${-r}px`),u.transform=`scale(${c}) matrix(${a.a}, ${a.b}, ${a.c}, ${a.d}, ${a.e-d.left}, ${a.f-d.top}) translateZ(0.0001px)`}}})),!1!==l&&Array.from(i.querySelectorAll("iframe"),(({contentWindow:e})=>{null==e||e.postMessage(`${t}${l}`,"null"===window.origin?"*":window.origin)}))}r=1,o=void 0;const i=(t,e,r)=>{if(t.getAttribute(e)!==r)return t.setAttribute(e,r),!0};function a({once:t=!1,target:e=document}={}){const r="Apple Computer, Inc."===navigator.vendor?[n]:[];let o=!t;const a=()=>{for(const t of r)t({target:e});!function(t=document){Array.from(t.querySelectorAll('svg[data-marp-fitting="svg"]'),(t=>{var e;const r=t.firstChild,o=r.firstChild,{scrollWidth:n,scrollHeight:a}=o;let l,s=1;if(t.hasAttribute("data-marp-fitting-code")&&(l=null===(e=t.parentElement)||void 0===e?void 0:e.parentElement),t.hasAttribute("data-marp-fitting-math")&&(l=t.parentElement),l){const t=getComputedStyle(l),e=Math.ceil(l.clientWidth-parseFloat(t.paddingLeft||"0")-parseFloat(t.paddingRight||"0"));e&&(s=e)}const c=Math.max(n,s),d=Math.max(a,1),u=`0 0 ${c} ${d}`;i(r,"width",`${c}`),i(r,"height",`${d}`),i(t,"preserveAspectRatio",getComputedStyle(t).getPropertyValue("--preserve-aspect-ratio")||"xMinYMin meet"),i(t,"viewBox",u)&&t.classList.toggle("__reflow__")}))}(e),o&&window.requestAnimationFrame(a)};return a(),()=>{o=!1}}const l=Symbol(),s=document.currentScript;((t=document)=>{if("undefined"==typeof window)throw new Error("Marp Core's browser script is valid only in browser context.");if(t[l])return t[l];const e=a({target:t}),r=()=>{e(),delete t[l]};Object.defineProperty(t,l,{configurable:!0,value:r})})(s?s.getRootNode():document)}();
</script></foreignObject></svg></div><script>!function(){"use strict";var e=function(e,t){var n,r=1===(e.parent||e).nodeType?e.parent||e:document.querySelector(e.parent||e),s=[].filter.call("string"==typeof e.slides?r.querySelectorAll(e.slides):e.slides||r.children,(function(e){return"SCRIPT"!==e.nodeName})),a={},i=function(e,t){return(t=t||{}).index=s.indexOf(e),t.slide=e,t},o=function(e,t){a[e]=(a[e]||[]).filter((function(e){return e!==t}))},l=function(e,t){return(a[e]||[]).reduce((function(e,n){return e&&!1!==n(t)}),!0)},c=function(e,t){s[e]&&(n&&l("deactivate",i(n,t)),n=s[e],l("activate",i(n,t)))},d=function(e,t){var r=s.indexOf(n)+e;l(e>0?"next":"prev",i(n,t))&&c(r,t)},u={off:o,on:function(e,t){return(a[e]||(a[e]=[])).push(t),o.bind(null,e,t)},fire:l,slide:function(e,t){if(!arguments.length)return s.indexOf(n);l("slide",i(s[e],t))&&c(e,t)},next:d.bind(null,1),prev:d.bind(null,-1),parent:r,slides:s,destroy:function(e){l("destroy",i(n,e)),a={}}};return(t||[]).forEach((function(e){e(u)})),n||c(0),u};function t(e){e.parent.classList.add("bespoke-marp-parent"),e.slides.forEach((e=>e.classList.add("bespoke-marp-slide"))),e.on("activate",(t=>{const n=t.slide,r=!n.classList.contains("bespoke-marp-active");e.slides.forEach((e=>{e.classList.remove("bespoke-marp-active"),e.setAttribute("aria-hidden","true")})),n.classList.add("bespoke-marp-active"),n.removeAttribute("aria-hidden"),r&&(n.classList.add("bespoke-marp-active-ready"),document.body.clientHeight,n.classList.remove("bespoke-marp-active-ready"))}))}function n(e){let t=0,n=0;Object.defineProperty(e,"fragments",{enumerable:!0,value:e.slides.map((e=>[null,...e.querySelectorAll("[data-marpit-fragment]")]))});const r=r=>void 0!==e.fragments[t][n+r],s=(r,s)=>{t=r,n=s,e.fragments.forEach(((e,t)=>{e.forEach(((e,n)=>{if(null==e)return;const a=t<r||t===r&&n<=s;e.setAttribute("data-bespoke-marp-fragment",a?"active":"inactive"),t===r&&n===s?e.setAttribute("data-bespoke-marp-current-fragment","current"):e.removeAttribute("data-bespoke-marp-current-fragment")}))})),e.fragmentIndex=s;const a={slide:e.slides[r],index:r,fragments:e.fragments[r],fragmentIndex:s};e.fire("fragment",a)};e.on("next",(({fragment:a=!0})=>{if(a){if(r(1))return s(t,n+1),!1;const a=t+1;e.fragments[a]&&s(a,0)}else{const r=e.fragments[t].length;if(n+1<r)return s(t,r-1),!1;const a=e.fragments[t+1];a&&s(t+1,a.length-1)}})),e.on("prev",(({fragment:a=!0})=>{if(r(-1)&&a)return s(t,n-1),!1;const i=t-1;e.fragments[i]&&s(i,e.fragments[i].length-1)})),e.on("slide",(({index:t,fragment:n})=>{let r=0;if(void 0!==n){const s=e.fragments[t];if(s){const{length:e}=s;r=-1===n?e-1:Math.min(Math.max(n,0),e-1)}}s(t,r)})),s(0,0)}
/*!
* screenfull
* v5.1.0 - 2020-12-24
* (c) Sindre Sorhus; MIT License
*/
var r,s=(function(e){!function(){var t="undefined"!=typeof window&&void 0!==window.document?window.document:{},n=e.exports,r=function(){for(var e,n=[["requestFullscreen","exitFullscreen","fullscreenElement","fullscreenEnabled","fullscreenchange","fullscreenerror"],["webkitRequestFullscreen","webkitExitFullscreen","webkitFullscreenElement","webkitFullscreenEnabled","webkitfullscreenchange","webkitfullscreenerror"],["webkitRequestFullScreen","webkitCancelFullScreen","webkitCurrentFullScreenElement","webkitCancelFullScreen","webkitfullscreenchange","webkitfullscreenerror"],["mozRequestFullScreen","mozCancelFullScreen","mozFullScreenElement","mozFullScreenEnabled","mozfullscreenchange","mozfullscreenerror"],["msRequestFullscreen","msExitFullscreen","msFullscreenElement","msFullscreenEnabled","MSFullscreenChange","MSFullscreenError"]],r=0,s=n.length,a={};r<s;r++)if((e=n[r])&&e[1]in t){for(r=0;r<e.length;r++)a[n[0][r]]=e[r];return a}return!1}(),s={change:r.fullscreenchange,error:r.fullscreenerror},a={request:function(e,n){return new Promise(function(s,a){var i=function(){this.off("change",i),s()}.bind(this);this.on("change",i);var o=(e=e||t.documentElement)[r.requestFullscreen](n);o instanceof Promise&&o.then(i).catch(a)}.bind(this))},exit:function(){return new Promise(function(e,n){if(this.isFullscreen){var s=function(){this.off("change",s),e()}.bind(this);this.on("change",s);var a=t[r.exitFullscreen]();a instanceof Promise&&a.then(s).catch(n)}else e()}.bind(this))},toggle:function(e,t){return this.isFullscreen?this.exit():this.request(e,t)},onchange:function(e){this.on("change",e)},onerror:function(e){this.on("error",e)},on:function(e,n){var r=s[e];r&&t.addEventListener(r,n,!1)},off:function(e,n){var r=s[e];r&&t.removeEventListener(r,n,!1)},raw:r};r?(Object.defineProperties(a,{isFullscreen:{get:function(){return Boolean(t[r.fullscreenElement])}},element:{enumerable:!0,get:function(){return t[r.fullscreenElement]}},isEnabled:{enumerable:!0,get:function(){return Boolean(t[r.fullscreenEnabled])}}}),n?e.exports=a:window.screenfull=a):n?e.exports={isEnabled:!1}:window.screenfull={isEnabled:!1}}()}(r={exports:{}},r.exports),r.exports);function a(e){e.fullscreen=()=>{s.isEnabled&&s.toggle(document.body)},document.addEventListener("keydown",(t=>{70!==t.which&&122!==t.which||t.altKey||t.ctrlKey||t.metaKey||!s.isEnabled||(e.fullscreen(),t.preventDefault())}))}function i(e=2e3){return t=>{let n;function r(){n&&clearTimeout(n),n=setTimeout((()=>{t.parent.classList.add("bespoke-marp-inactive"),t.fire("marp-inactive")}),e),t.parent.classList.contains("bespoke-marp-inactive")&&(t.parent.classList.remove("bespoke-marp-inactive"),t.fire("marp-active"))}document.addEventListener("mousedown",r),document.addEventListener("mousemove",r),document.addEventListener("touchend",r),setTimeout(r,0)}}const o=["AUDIO","BUTTON","INPUT","SELECT","TEXTAREA","VIDEO"];function l(e){e.parent.addEventListener("keydown",(e=>{if(!e.target)return;const t=e.target;(o.includes(t.nodeName)||"true"===t.contentEditable)&&e.stopPropagation()}))}function c(e){window.addEventListener("load",(()=>{for(const t of e.slides){const e=t.querySelector("[data-marp-fitting]")?"":"hideable";t.setAttribute("data-bespoke-marp-load",e)}}))}var d;function u({interval:e=200}={}){return t=>{document.addEventListener("keydown",(e=>{if(32===e.which&&e.shiftKey)t.prev();else if(33===e.which||37===e.which||38===e.which)t.prev({fragment:!e.shiftKey});else if(32!==e.which||e.shiftKey)if(34===e.which||39===e.which||40===e.which)t.next({fragment:!e.shiftKey});else if(35===e.which)t.slide(t.slides.length-1,{fragment:-1});else{if(36!==e.which)return;t.slide(0)}else t.next();e.preventDefault()}));let n,r,s=0;t.parent.addEventListener("wheel",(a=>{let i=!1;const o=(e,t)=>{e&&(i=i||function(e,t){return function(e,t){const n=t===d.X?"Width":"Height";return e[`client${n}`]<e[`scroll${n}`]}(e,t)&&function(e,t){const{overflow:n}=e,r=e[`overflow${t}`];return"auto"===n||"scroll"===n||"auto"===r||"scroll"===r}(getComputedStyle(e),t)}(e,t)),(null==e?void 0:e.parentElement)&&o(e.parentElement,t)};if(0!==a.deltaX&&o(a.target,d.X),0!==a.deltaY&&o(a.target,d.Y),i)return;a.preventDefault(),r&&clearTimeout(r),r=setTimeout((()=>{n=0}),e);const l=Date.now()-s<e,c=Math.sqrt(Math.pow(a.deltaX,2)+Math.pow(a.deltaY,2)),u=c<=n;if(n=c,l||u)return;let f;(a.deltaX>0||a.deltaY>0)&&(f="next"),(a.deltaX<0||a.deltaY<0)&&(f="prev"),f&&(t[f](),s=Date.now())}))}}!function(e){e.X="X",e.Y="Y"}(d||(d={}));const f=(...e)=>history.replaceState(...e),m="data-bespoke-view";var p;!function(e){e.Normal="",e.Presenter="presenter",e.Next="next"}(p||(p={}));const h=(e,{protocol:t,host:n,pathname:r,hash:s}=location)=>{const a=e.toString();return`${t}//${n}${r}${a?"?":""}${a}${s}`},g=()=>{switch(document.body.getAttribute(m)){case p.Normal:return p.Normal;case p.Presenter:return p.Presenter;case p.Next:return p.Next;default:throw new Error("View mode is not assigned.")}},v=e=>new URLSearchParams(location.search).get(e),b=(e,t={})=>{const n=Object.assign({location:location,setter:f},t),r=new URLSearchParams(n.location.search);for(const t of Object.keys(e)){const n=e[t];"string"==typeof n?r.set(t,n):r.delete(t)}try{n.setter(null,document.title,h(r,n.location))}catch(e){console.error(e)}},w={available:(()=>{try{return localStorage.setItem("bespoke-marp","bespoke-marp"),localStorage.removeItem("bespoke-marp"),!0}catch(e){return console.warn("Warning: Using localStorage is restricted in the current host so some features may not work."),!1}})(),get:e=>{try{return localStorage.getItem(e)}catch(e){return null}},set:(e,t)=>{try{return localStorage.setItem(e,t),!0}catch(e){return!1}},remove:e=>{try{return localStorage.removeItem(e),!0}catch(e){return!1}}};function y(e=".bespoke-marp-osc"){const t=document.querySelector(e);if(!t)return()=>{};const n=(e,n)=>{t.querySelectorAll(`[data-bespoke-marp-osc=${JSON.stringify(e)}]`).forEach(n)};return s.isEnabled||n("fullscreen",(e=>e.style.display="none")),w.available||n("presenter",(e=>{e.disabled=!0,e.title="Presenter view is disabled due to restricted localStorage."})),e=>{t.addEventListener("click",(t=>{if(t.target instanceof HTMLElement){const{bespokeMarpOsc:n}=t.target.dataset;switch(n&&t.target.blur(),n){case"next":e.next({fragment:!t.shiftKey});break;case"prev":e.prev({fragment:!t.shiftKey});break;case"fullscreen":"function"==typeof e.fullscreen&&s.isEnabled&&e.fullscreen();break;case"presenter":e.openPresenterView()}}})),e.parent.appendChild(t),e.on("activate",(({index:t})=>{n("page",(n=>n.textContent=`Page ${t+1} of ${e.slides.length}`))})),e.on("fragment",(({index:t,fragments:r,fragmentIndex:s})=>{n("prev",(e=>e.disabled=0===t&&0===s)),n("next",(n=>n.disabled=t===e.slides.length-1&&s===r.length-1))})),e.on("marp-active",(()=>t.removeAttribute("aria-hidden"))),e.on("marp-inactive",(()=>t.setAttribute("aria-hidden","true"))),s.isEnabled&&s.onchange((()=>n("fullscreen",(e=>e.classList.toggle("exit",s.isEnabled&&s.isFullscreen)))))}}function x(){const e=Math.max(Math.floor(.85*window.innerWidth),640),t=Math.max(Math.floor(.85*window.innerHeight),360);return window.open(this.presenterUrl,`bespoke-marp-presenter-${this.syncKey}`,`width=${e},height=${t},menubar=no,toolbar=no`)}function k(){const e=new URLSearchParams(location.search);return e.set("view","presenter"),e.set("sync",this.syncKey),h(e)}var E=["area","base","br","col","command","embed","hr","img","input","keygen","link","meta","param","source","track","wbr"];let L=e=>String(e).replace(/[&<>"']/g,(e=>`&${S[e]};`)),S={"&":"amp","<":"lt",">":"gt",'"':"quot","'":"apos"},I="dangerouslySetInnerHTML",P={className:"class",htmlFor:"for"},M={};function N(e,t){let n=[],r="";t=t||{};for(let e=arguments.length;e-- >2;)n.push(arguments[e]);if("function"==typeof e)return t.children=n.reverse(),e(t);if(e){if(r+="<"+e,t)for(let e in t)!1!==t[e]&&null!=t[e]&&e!==I&&(r+=` ${P[e]?P[e]:L(e)}="${L(t[e])}"`);r+=">"}if(-1===E.indexOf(e)){if(t[I])r+=t[I].__html;else for(;n.length;){let e=n.pop();if(e)if(e.pop)for(let t=e.length;t--;)n.push(e[t]);else r+=!0===M[e]?e:L(e)}r+=e?`</${e}>`:""}return M[r]=!0,r}const F=({children:e})=>N(null,null,...e),$="bespoke-marp-presenter-container",O="bespoke-marp-presenter-next",q="bespoke-marp-presenter-next-container",C="bespoke-marp-presenter-note-container",T="bespoke-marp-presenter-info-container",A="bespoke-marp-presenter-info-page",K="bespoke-marp-presenter-info-page-text",j="bespoke-marp-presenter-info-page-prev",R="bespoke-marp-presenter-info-page-next",U="bespoke-marp-presenter-info-time",D="bespoke-marp-presenter-info-timer";function V(e){const{title:t}=document;document.title="[Presenter view]"+(t?` - ${t}`:"");const n={},r=e=>(n[e]=n[e]||document.querySelector(`.${e}`),n[e]);document.body.appendChild((e=>{const t=document.createElement("div");return t.className=$,t.appendChild(e),t.insertAdjacentHTML("beforeend",N(F,null,N("div",{class:q},N("iframe",{class:O,src:"?view=next"})),N("div",{class:C}),N("div",{class:T},N("div",{class:A},N("button",{class:j,tabindex:"-1",title:"Previous"},"Previous"),N("span",{class:K}),N("button",{class:R,tabindex:"-1",title:"Next"},"Next")),N("time",{class:U,title:"Current time"}),N("div",{class:D})))),t})(e.parent)),(e=>{r(q).addEventListener("click",(()=>e.next()));const t=r(O),n=(s=t,(e,t)=>{var n;return null===(n=s.contentWindow)||void 0===n?void 0:n.postMessage(`navigate:${e},${t}`,"null"===window.origin?"*":window.origin)});var s;t.addEventListener("load",(()=>{r(q).classList.add("active"),n(e.slide(),e.fragmentIndex),e.on("fragment",(({index:e,fragmentIndex:t})=>n(e,t)))}));const a=document.querySelectorAll(".bespoke-marp-note");a.forEach((e=>{e.addEventListener("keydown",(e=>e.stopPropagation())),r(C).appendChild(e)})),e.on("activate",(()=>a.forEach((t=>t.classList.toggle("active",t.dataset.index==e.slide()))))),e.on("activate",(({index:t})=>{r(K).textContent=`${t+1} / ${e.slides.length}`}));const i=r(j),o=r(R);i.addEventListener("click",(t=>{i.blur(),e.prev({fragment:!t.shiftKey})})),o.addEventListener("click",(t=>{o.blur(),e.next({fragment:!t.shiftKey})})),e.on("fragment",(({index:t,fragments:n,fragmentIndex:r})=>{i.disabled=0===t&&0===r,o.disabled=t===e.slides.length-1&&r===n.length-1}));const l=()=>r(U).textContent=(new Date).toLocaleTimeString();l(),setInterval(l,250)})(e)}function X(e){const t=g();return t===p.Next&&e.appendChild(document.createElement("span")),e=>{t===p.Normal&&function(e){if(!(e=>e.syncKey&&"string"==typeof e.syncKey)(e))throw new Error("The current instance of Bespoke.js is invalid for Marp bespoke presenter plugin.");Object.defineProperties(e,{openPresenterView:{enumerable:!0,value:x},presenterUrl:{enumerable:!0,get:k}}),w.available&&document.addEventListener("keydown",(t=>{80!==t.which||t.altKey||t.ctrlKey||t.metaKey||(t.preventDefault(),e.openPresenterView())}))}(e),t===p.Presenter&&V(e),t===p.Next&&function(e){const t=t=>{if(t.origin!==window.origin)return;const[n,r]=t.data.split(":");if("navigate"===n){const[t,n]=r.split(",");let s=Number.parseInt(t,10),a=Number.parseInt(n,10)+1;a>=e.fragments[s].length&&(s+=1,a=0),e.slide(s,{fragment:a})}};window.addEventListener("message",t),e.on("destroy",(()=>window.removeEventListener("message",t)))}(e)}}function Y(e){e.on("activate",(t=>{document.querySelectorAll(".bespoke-progress-parent > .bespoke-progress-bar").forEach((n=>{n.style.flexBasis=100*t.index/(e.slides.length-1)+"%"}))}))}const B=e=>{const t=Number.parseInt(e,10);return Number.isNaN(t)?null:t};function z(e={}){const t=Object.assign({history:!0},e);return e=>{let n=!0;const r=e=>{const t=n;try{return n=!0,e()}finally{n=t}},s=(t={fragment:!0})=>{((t,n)=>{const{fragments:r,slides:s}=e,a=Math.max(0,Math.min(t,s.length-1)),i=Math.max(0,Math.min(n||0,r[a].length-1));a===e.slide()&&i===e.fragmentIndex||e.slide(a,{fragment:i})})((B(location.hash.slice(1))||1)-1,t.fragment?B(v("f")||""):null)};e.on("fragment",(({index:e,fragmentIndex:r})=>{n||b({f:0===r||r.toString()},{location:Object.assign(Object.assign({},location),{hash:`#${e+1}`}),setter:(...e)=>t.history?history.pushState(...e):history.replaceState(...e)})})),setTimeout((()=>{s(),window.addEventListener("hashchange",(()=>r((()=>{s({fragment:!1}),b({f:void 0})})))),window.addEventListener("popstate",(()=>{n||r((()=>s()))})),n=!1}),0)}}let H;function W(e={}){const t=e.key||((e=21)=>{let t="",n=crypto.getRandomValues(new Uint8Array(e));for(;e--;){let r=63&n[e];t+=r<36?r.toString(36):r<62?(r-26).toString(36).toUpperCase():r<63?"_":"-"}return t})(),n=`bespoke-marp-sync-${t}`,r=()=>{const e=w.get(n);return e?JSON.parse(e):Object.create(null)},s=e=>{const t=r(),s=Object.assign(Object.assign({},t),e(t));return w.set(n,JSON.stringify(s)),s};return s((e=>({reference:(e.reference||0)+1}))),e=>{Object.defineProperty(e,"syncKey",{value:t,enumerable:!0});let a=!0;setTimeout((()=>{e.on("fragment",(e=>{a&&s((()=>({index:e.index,fragmentIndex:e.fragmentIndex})))}))}),0),window.addEventListener("storage",(t=>{if(t.key===n&&t.oldValue&&t.newValue){const n=JSON.parse(t.oldValue),r=JSON.parse(t.newValue);if(n.index!==r.index||n.fragmentIndex!==r.fragmentIndex)try{a=!1,e.slide(r.index,{fragment:r.fragmentIndex})}finally{a=!0}}})),e.on("destroy",(()=>{const{reference:e}=r();void 0===e||e<=1?w.remove(n):s((()=>({reference:e-1})))}))}}function J({slope:e=Math.tan(-35*Math.PI/180),swipeThreshold:t=30}={}){return n=>{let r;const s=n.parent,a=e=>{const t=s.getBoundingClientRect();return{x:e.pageX-(t.left+t.right)/2,y:e.pageY-(t.top+t.bottom)/2}};s.addEventListener("touchstart",(e=>{r=1===e.touches.length?a(e.touches[0]):void 0}),{passive:!0}),s.addEventListener("touchmove",(e=>{if(r)if(1===e.touches.length){e.preventDefault();const t=a(e.touches[0]),n=t.x-r.x,s=t.y-r.y;r.delta=Math.sqrt(Math.pow(Math.abs(n),2)+Math.pow(Math.abs(s),2)),r.radian=Math.atan2(n,s)}else r=void 0})),s.addEventListener("touchend",(s=>{if(r){if(r.delta&&r.delta>=t&&r.radian){let t=r.radian-e;t=(t+Math.PI)%(2*Math.PI)-Math.PI,n[t<0?"next":"prev"](),s.stopPropagation()}r=void 0}}),{passive:!0})}}
/*! *****************************************************************************
Copyright (c) Microsoft Corporation.

Permission to use, copy, modify, and/or distribute this software for any
purpose with or without fee is hereby granted.

THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH
REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY
AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM
LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR
OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
PERFORMANCE OF THIS SOFTWARE.
***************************************************************************** */function _(e,t,n,r){return new(n||(n=Promise))((function(s,a){function i(e){try{l(r.next(e))}catch(e){a(e)}}function o(e){try{l(r.throw(e))}catch(e){a(e)}}function l(e){var t;e.done?s(e.value):(t=e.value,t instanceof n?t:new n((function(e){e(t)}))).then(i,o)}l((r=r.apply(e,t||[])).next())}))}const G=()=>(void 0===H&&(H="wakeLock"in navigator&&navigator.wakeLock),H),Q=()=>_(void 0,void 0,void 0,(function*(){const e=G();if(e)try{const t=yield e.request("screen");return t.addEventListener("release",(()=>{console.debug("[Marp CLI] Wake Lock was released")})),console.debug("[Marp CLI] Wake Lock is active"),t}catch(e){console.warn(e)}return null}));function Z(){return _(this,void 0,void 0,(function*(){if(!G())return;let e;const t=()=>{e&&"visible"===document.visibilityState&&Q()};return document.addEventListener("visibilitychange",t),document.addEventListener("fullscreenchange",t),e=yield Q(),e}))}const ee=[p.Normal,p.Presenter,p.Next];!function(r=document.getElementById("p")){document.body.setAttribute(m,(()=>{switch(v("view")){case"next":return p.Next;case"presenter":return p.Presenter;default:return p.Normal}})());const s=(e=>{const t=v(e);return b({[e]:void 0}),t})("sync")||void 0,o=!1,d=!0,f=e(r,((...e)=>{const t=ee.findIndex((e=>g()===e));if(t<0)throw new Error("Invalid view");return e.map((([e,n])=>e[t]&&n)).filter((e=>e))})([[d,d,o],W({key:s})],[[d,d,d],X(r)],[[d,d,o],l],[[d,d,d],t],[[d,o,o],i()],[[d,d,d],c],[[d,d,d],z({history:!1})],[[d,d,o],u()],[[d,d,o],a],[[d,o,o],Y],[[d,d,o],J()],[[d,o,o],y()],[[d,d,d],n],[[d,d,o],Z]));window.addEventListener("beforeunload",(()=>b({sync:f.syncKey}))),window.addEventListener("unload",(()=>f.destroy()))}()}();</script></body></html>